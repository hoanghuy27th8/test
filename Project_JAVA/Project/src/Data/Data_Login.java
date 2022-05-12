/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hoàng Huy
 */
public class Data_Login {
    public Connection ketnoi() throws Exception{
            String url ="jdbc:sqlserver://localhost;database=DataLogin";
            String user="sa";
            String pass="123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
    }
    
    public boolean kiemtra(String username, String password) throws Exception{
        try
            {
            Connection con = ketnoi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from data");
            while(rs.next()){ 
                if(rs.getString(1).equals(username) && rs.getString(2).equals(password)) 
                    return true;
            }
        }catch(Exception e){
        }
        return false;
    }
 
    
//    public static void main(String[] args) throws Exception {
//        Data_Login d = new Data_Login();
//        String a ="huy";
//        String b="123";
//        
//        d.kiemtra(a, b);
//        if(d.kiemtra(a,b).equals("dung")){
//            System.out.println("dung");
//        }else System.out.println("sai");
//    }
}
