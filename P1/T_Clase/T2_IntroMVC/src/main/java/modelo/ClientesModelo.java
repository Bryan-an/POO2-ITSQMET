/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ClientesControlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class ClientesModelo {

    private CBDD cnx;
    private Statement stmt;
    private ResultSet resultado;
    private Connection c;

    public ClientesModelo() {
        cnx = new CBDD();
    }

    public DefaultTableModel consultarClientes(ClientesControlador cc) {
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

            consulta = "SELECT * FROM clientes WHERE nombres_cli LIKE '%" + cc.getBuscar()
                    + "%' OR ruc_cli LIKE '%" + cc.getBuscar() + "%'";

            resultado = stmt.executeQuery(consulta);

            while (resultado.next()) {
                datos[0] = resultado.getInt("id_cli") + "";
                datos[1] = resultado.getString("nombres_cli");
                datos[2] = resultado.getString("ruc_cli");
                datos[3] = resultado.getString("contacto_cli");
                datos[4] = resultado.getString("direccion_cli");
                dtm.addRow(datos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dtm;
    }

    public boolean insertarClientes(ClientesControlador cc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "INSERT INTO clientes(nombres_cli, ruc_cli, contacto_cli, direccion_cli) VALUES ('"
                    + cc.getNombres() + "', '" + cc.getRuc() + "', '" + cc.getContacto()
                    + "', '" + cc.getDireccion() + "')";

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

    public boolean actualizarClientes(ClientesControlador cc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "UPDATE clientes SET "
                    + "nombres_cli = '" + cc.getNombres()
                    + "', ruc_cli = '" + cc.getRuc()
                    + "', contacto_cli =  '" + cc.getContacto()
                    + "' , direccion_cli = '" + cc.getDireccion()
                    + "' WHERE id_cli = " + cc.getId();

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

    public boolean borrarClientes(ClientesControlador cc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "DELETE FROM clientes WHERE id_cli = " + cc.getId();
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
