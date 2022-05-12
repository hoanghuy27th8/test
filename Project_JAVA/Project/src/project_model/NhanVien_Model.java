/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_model;

import Data.Data_Main;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoàng Huy
 */
public class NhanVien_Model {
    public boolean them(NhanVien nv) throws Exception{
        String sql="insert into Data_NV(MaNV,HoTen,gioitinh,email,ngaysinh,sdt,diachi,phongban,chucvu,luongcoban,giotangca,heso,songaynghi,thuong,tong,image) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try(
                Connection con = Data_Main.ketnoi();
                PreparedStatement pr = con.prepareStatement(sql);
            ){
            pr.setString(1, nv.getMaNV());// 1 tương ứng với ? đầu tiên trong câu truy v
            pr.setString(2, nv.getHoten());
            pr.setInt(3, nv.getGioitinh());
            pr.setString(4, nv.getEmail());
            pr.setDate(5, nv.getNgaysinh());
            pr.setString(6, nv.getSdt());
            pr.setString(7, nv.getDiachi());
            pr.setString(8, nv.getPhongban());
            pr.setString(9, nv.getChucvu());
            pr.setString(10, nv.getLuongcoban());
            pr.setString(11, nv.getGiotangca());
            pr.setString(12, nv.getHeso());
            pr.setString(13, nv.getSongaynghi());
            pr.setString(14, nv.getThuong());
            pr.setString(15, nv.getTong());
            pr.setBytes(16, nv.getImg());
            
            return pr.executeUpdate() > 0; // >0 là thành công
        }
    }
    public boolean capnhat(NhanVien nv) throws Exception{
        String sql="update Data_NV set MaNV = ?,HoTen = ?,gioitinh = ?,email = ?,ngaysinh = ?,sdt = ?,diachi = ?,phongban = ?,chucvu = ?,luongcoban = ? "
                + ",giotangca = ?, heso = ?, songaynghi = ?, thuong = ?, tong = ?, image = ? where MaNV = ?";
        try(
                Connection con = Data_Main.ketnoi();
                PreparedStatement pr = con.prepareStatement(sql);
            ){
            pr.setString(17, nv.getMaNV());
            pr.setString(1, nv.getMaNV());// 1 tương ứng với ? đầu tiên trong câu truy v
            pr.setString(2, nv.getHoten());
            pr.setInt(3, nv.getGioitinh());
            pr.setString(4, nv.getEmail());
            pr.setDate(5, nv.getNgaysinh());
            pr.setString(6, nv.getSdt());
            pr.setString(7, nv.getDiachi());
            pr.setString(8, nv.getPhongban());
            pr.setString(9, nv.getChucvu());
            pr.setString(10, nv.getLuongcoban());
            pr.setString(11, nv.getGiotangca());
            pr.setString(12, nv.getHeso());
            pr.setString(13, nv.getSongaynghi());
            pr.setString(14, nv.getThuong());
            pr.setString(15, nv.getTong());
            pr.setBytes(16, nv.getImg());
            
            return pr.executeUpdate() > 0; // >0 là thành công
        }
    }
    
    public NhanVien timkiem(String maNV) throws Exception{
        String sql="select * from Data_NV where MaNV= ?";
        try(
                Connection con = Data_Main.ketnoi();
                PreparedStatement pr = con.prepareStatement(sql);
            ){
            pr.setString(1, maNV);// 1 tương ứng với ? đầu tiên trong câu truy v
            ResultSet rs = pr.executeQuery();
            
            if(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoten(rs.getString("HoTen"));
                nv.setDiachi(rs.getString("diachi"));
                nv.setEmail(rs.getString("email"));
                nv.setGioitinh(rs.getInt("gioitinh"));
                nv.setNgaysinh(rs.getDate("ngaysinh"));
                nv.setSdt(rs.getString("sdt"));
                nv.setPhongban(rs.getString("phongban"));
                nv.setChucvu(rs.getString("chucvu"));
                nv.setLuongcoban(rs.getString("Luongcoban"));
                nv.setHeso(rs.getString("heso"));
                nv.setSongaynghi(rs.getString("songaynghi"));
                nv.setGiotangca(rs.getString("giotangca"));
                nv.setThuong(rs.getString("Thuong"));
                nv.setTong(rs.getString("Tong"));
                nv.setImg(rs.getBytes("image"));
                return nv;
            }
                     
            return null; // >0 là thành công
        }
    }
    public boolean xoa(NhanVien nv) throws Exception{
        String sql = "delete Data_NV where MaNV = ?";
        try (
                Connection con = Data_Main.ketnoi();
                PreparedStatement pr = con.prepareStatement(sql);
            ) {
                pr.setString(1,nv.getMaNV());
                return pr.executeUpdate() > 0;
            }
    }
    public List load()throws Exception{
        String sql ="select * from Data_NV";
        try(
                Connection con = Data_Main.ketnoi();
                PreparedStatement pr = con.prepareStatement(sql);
            ){
            List<NhanVien> l = new ArrayList<>();
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoten(rs.getString("HoTen"));
                nv.setDiachi(rs.getString("diachi"));
                nv.setEmail(rs.getString("email"));
                nv.setGioitinh(rs.getInt("gioitinh"));
                nv.setNgaysinh(rs.getDate("ngaysinh"));
                nv.setSdt(rs.getString("sdt"));
                nv.setPhongban(rs.getString("phongban"));
                nv.setChucvu(rs.getString("chucvu"));
                nv.setLuongcoban(rs.getString("Luongcoban"));
                nv.setHeso(rs.getString("heso"));
                nv.setSongaynghi(rs.getString("Songaynghi"));
                nv.setGiotangca(rs.getString("Giotangca"));
                nv.setThuong(rs.getString("Thuong"));
                nv.setTong(rs.getString("Tong"));
                nv.setImg(rs.getBytes("image"));
                l.add(nv);
            }
                     
            return l; // >0 là thành công
        }
    }
}
    

