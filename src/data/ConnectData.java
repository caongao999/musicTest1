/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ACER NITRO 5
 */
public class ConnectData {
    
    
    public static Connection getConnection() {
        Connection c = null; 
        try{
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        //Các thông số để kết nối
        String url = "jdbc:mysql://127.0.0.1:3306/loginmusic"; 
        String user = "root"; 
        String pass = ""; 
        
        //Tạo kết nối 
        
        c = DriverManager.getConnection(url, user, pass); 
        
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return c;
        
    }
    
    //có sự kết nối- có close ngắt kết nối 
    public static void CloseConnection(Connection c) { //phương thức ngắt kết nối
        try {
            if(c!= null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
