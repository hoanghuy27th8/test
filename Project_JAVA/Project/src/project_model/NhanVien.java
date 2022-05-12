/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_model;

import java.sql.Date;



/**
 *
 * @author Hoàng Huy
 */
public class NhanVien {
    private String maNV,hoten,sdt,diachi,phongban,email,chucvu,giotangca,heso,songaynghi,thuong,tong,luongcoban;

    private int gioitinh;
    private Date ngaysinh;
    private byte[] img;

    public NhanVien() {
    }
    public NhanVien(String maNV, String hoten, String sdt, String diachi, String phongban, String email, String chucvu, String giotangca, String heso, String songaynghi, String thuong, String tong, String luongcoban, int gioitinh, Date ngaysinh, byte[] img) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.phongban = phongban;
        this.email = email;
        this.chucvu = chucvu;
        this.giotangca = giotangca;
        this.heso = heso;
        this.songaynghi = songaynghi;
        this.thuong = thuong;
        this.tong = tong;
        this.luongcoban = luongcoban;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.img = img;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(String luongcoban) {
        this.luongcoban = luongcoban;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getGiotangca() {
        return giotangca;
    }

    public void setGiotangca(String giotangca) {
        this.giotangca = giotangca;
    }

    public String getHeso() {
        return heso;
    }

    public void setHeso(String heso) {
        this.heso = heso;
    }

    public String getSongaynghi() {
        return songaynghi;
    }

    public void setSongaynghi(String songaynghi) {
        this.songaynghi = songaynghi;
    }

    public String getThuong() {
        return thuong;
    }

    public void setThuong(String thuong) {
        this.thuong = thuong;
    }

    public String getTong() {
        return tong;
    }

    public void setTong(String tong) {
        this.tong = tong;
    }

    

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

 
    
}
