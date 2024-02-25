/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DBConnection {
    private static DBConnection connection;
    private  Connection conn;

    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_cmjd", "root", "eshan10540");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(connection == null){
            connection = new DBConnection();
        }
        return connection;
    }
    public Connection getConnection(){
        return conn;
    }
}


