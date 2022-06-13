/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;
import connect_db.*;
import java.sql.*;
/**
 *
 * @author FPTSHOP
 */

public class connectDB_tuthien {
    private Connection conn;
    connectDB_tuthien(){};
    
    public Connection createConn(){
        try{
            //Đăng ký Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection URL
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false&useUnicode=true&characterEncoding=UTF-8","root","0123456789");

            if (conn == null)
                System.out.println("Kết nối không thành công");
            else
                System.out.println("Kết nối thành công");
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    
}
