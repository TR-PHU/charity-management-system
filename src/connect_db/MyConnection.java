/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PHUTRAN
 */
public class MyConnection {
    private static String serverName = "localhost",username = "root",password="",dbname="java";
    private static Integer portNumber = 3306;
    
    public static Connection getConnection() { 
        Connection cnx = null;
        MysqlDataSource dataSource = new MysqlDataSource();
        
        dataSource.setServerName(serverName);
        dataSource.setPortNumber(portNumber);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(dbname);
        
        try {
            cnx = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}
