/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConection;

/**
 *
 * @author Student
 */

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/gestioneventos";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
