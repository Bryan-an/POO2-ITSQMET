/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class CBDD {

    // AyV5z@^9sE
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private Connection cnx = null;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/factu_pim";
    private static final String USER = "root";
    private static final String PASSWORD = "AyV5z@^9sE";

    public Connection conectar() {
        try {
            cnx = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//            System.out.println("Conexión exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cnx;
    }
}
