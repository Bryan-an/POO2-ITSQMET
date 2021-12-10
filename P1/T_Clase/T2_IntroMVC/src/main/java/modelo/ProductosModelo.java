/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ProductosControlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class ProductosModelo {

    private CBDD cnx;
    private Statement stmt;
    private ResultSet resultado;
    private Connection c;

    public ProductosModelo() {
        cnx = new CBDD();
    }

    public DefaultTableModel consultarProductos(ProductosControlador pc) {
        String consulta;
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Nombre");
        dtm.addColumn("Descripción");
        dtm.addColumn("Valor Compra");
        dtm.addColumn("Valor Venta");
        dtm.addColumn("Stock");
        dtm.addColumn("IVA");
        dtm.addColumn("Tipo");
        String[] datos = new String[8];

        try {
            c = cnx.conectar();
            stmt = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            consulta = "SELECT * FROM productos WHERE nombre_prod LIKE '%" + pc.getBuscar()
                    + "%' OR descripcion_prod LIKE '%" + pc.getBuscar() + "%'";

            resultado = stmt.executeQuery(consulta);

            while (resultado.next()) {
                datos[0] = resultado.getInt("id_prod") + "";
                datos[1] = resultado.getString("nombre_prod");
                datos[2] = resultado.getString("descripcion_prod");
                datos[3] = resultado.getDouble("valor_ref_comp_prod") + "";
                datos[4] = resultado.getDouble("valor_ref_venta_prod") + "";
                datos[5] = resultado.getInt("stock_prod") + "";
                datos[6] = resultado.getString("tiene_iva_prod");
                datos[7] = resultado.getString("tipo_prod");
                dtm.addRow(datos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dtm;
    }

    public boolean insertarProductos(ProductosControlador pc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "INSERT INTO productos (nombre_prod, descripcion_prod, "
                    + "valor_ref_comp_prod, valor_ref_venta_prod, stock_prod, "
                    + "tiene_iva_prod, tipo_prod) VALUES ('"
                    + pc.getNombre() + "', '"
                    + pc.getDescripcion() + "', "
                    + pc.getValorCompra() + ", "
                    + pc.getValorVenta() + ", "
                    + pc.getStock() + ", '"
                    + pc.getIva() + "', '"
                    + pc.getTipo() + "')";

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

    public boolean actualizarProductos(ProductosControlador pc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "UPDATE productos SET "
                    + "nombre_prod = '" + pc.getNombre()
                    + "', descripcion_prod = '" + pc.getDescripcion()
                    + "', valor_ref_comp_prod =  " + pc.getValorCompra()
                    + " , valor_ref_venta_prod = " + pc.getValorVenta()
                    + " , stock_prod = " + pc.getStock()
                    + " , tiene_iva_prod = '" + pc.getIva()
                    + "' , tipo_prod = '" + pc.getTipo()
                    + "' WHERE id_prod = " + pc.getId();

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

    public boolean borrarProductos(ProductosControlador pc) {
        boolean devolver = false;
        String consulta;

        try {
            c = cnx.conectar();
            stmt = c.createStatement();
            consulta = "DELETE FROM productos WHERE id_prod = " + pc.getId();
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
