package com.itsqm.modelo;

import java.sql.*;

/**
 *
 * @author Bryan
 */
public class CBDD {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/poo2_p2_t2_agenda";
    private static final String USER = "root";
    private static final String CLAVE = "";
    private Connection cnx = null;

    public Connection getConnection() {
        try {
            cnx = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cnx;
    }
}
