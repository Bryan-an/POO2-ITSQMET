package com.itsqm.modelo;

import java.sql.*;

/**
 *
 * @author Bryan
 */
public class Conexion {

    private Statement st;
    private String driver;
    private String user;
    private String pwd;
    private String cadena;
    private Connection con;

    public Conexion() {
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.user = "root";
        this.pwd = "";
        this.cadena = "jdbc:mysql://localhost:3306/poo2_p2_t2_agenda";
        this.con = this.crearConexion();
    }

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    public String getCadena() {
        return cadena;
    }

    public Connection getConexion() {
        return con;
    }

    Connection crearConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }

        try {
            Class.forName(getDriver()).newInstance();
            Connection con = DriverManager.getConnection(getCadena(), getUser(), getPwd());
            return con;
        } catch (Exception e) {
            return null;
        }
    }

    public String ejecutar(String sql) {
        String error = "";

        try {
            st = getConexion().createStatement();
            st.execute(sql);
            error = "Sentencia exitosa";
        } catch (Exception e) {
            error = e.getMessage();
        }

        return error;
    }

    public ResultSet consulta(String sql) {
        String error = "";
        ResultSet r = null;

        try {
            st = getConexion().createStatement();
            r = st.executeQuery(sql);
        } catch (Exception e) {
            error = e.getMessage();
        }

        return r;
    }
}
