/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ProveedoresControlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class ProveedoresModelo {

    private CBDD cnx;
    private Statement stmt;
    private ResultSet resultado;
    private Connection c;

    public ProveedoresModelo() {
        cnx = new CBDD();
    }

    public DefaultTableModel consultarProveedores(ProveedoresControlador pc) {
        String consulta;
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Nombres");
        dtm.addColumn("RUC");
        dtm.addColumn("Contacto");
        dtm.addColumn("Dirección");
        String[] datos = new String[5];

        try {
            c = cnx.conectar();
            stmt = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            consulta = "SELECT * FROM proveedores WHERE nombres_pro LIKE '%" + pc.getBuscar()
                    + "%' OR ruc_pro LIKE '%" + pc.getBuscar() + "%'";

            resultado = stmt.executeQuery(consulta);

            while (resultado.next()) {
                datos[0] = resultado.getInt("id_pro") + "";
                datos[1] = resultado.getString("nombres_pro");
                datos[2] = resultado.getString("ruc_pro");
                datos[3] = resultado.getString("contacto_pro");
                datos[4] = resultado.getString("direccion_pro");
                dtm.addRow(datos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dtm;
    }

    public boolean insertarProveedores(ProveedoresControlador pc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "INSERT INTO proveedores(nombres_pro, ruc_pro, contacto_pro, direccion_pro) VALUES ('"
                    + pc.getNombres() + "', '" + pc.getRuc() + "', '" + pc.getContacto()
                    + "', '" + pc.getDireccion() + "')";

            int resultado = stmt.executeUpdate(consulta);

            if (resultado == 1) {
                devolver = true;
            } else {
                devolver = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return devolver;
    }

    public boolean actualizarProveedores(ProveedoresControlador pc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "UPDATE proveedores SET "
                    + "nombres_pro = '" + pc.getNombres()
                    + "', ruc_pro = '" + pc.getRuc()
                    + "', contacto_pro =  '" + pc.getContacto()
                    + "' , direccion_pro = '" + pc.getDireccion()
                    + "' WHERE id_pro = " + pc.getId();

            int resultado = stmt.executeUpdate(consulta);

            if (resultado == 1) {
                devolver = true;
            } else {
                devolver = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return devolver;
    }

    public boolean borrarProveedores(ProveedoresControlador pc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "DELETE FROM proveedores WHERE id_pro = " + pc.getId();
            int resultado = stmt.executeUpdate(consulta);

            if (resultado == 1) {
                devolver = true;
            } else {
                devolver = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return devolver;
    }
}
