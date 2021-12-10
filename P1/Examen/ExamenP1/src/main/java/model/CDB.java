/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class CDB {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private Connection connection = null;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/poo2_ep1_db_rrhh";
    private static final String USER = "root";
    private static final String PASSWORD = "AyV5z@^9sE";

    public Connection connect() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return connection;
    }
}
