package com.itsqm.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Bryan
 */
public class AgendaModelo {

    private CBDD cnx;
    private PreparedStatement stmt;
    private ResultSet resultado;
    private Connection c;

    public AgendaModelo() {
        cnx = new CBDD();
    }

    public JSONObject consultarClientes(String buscar) {
        String consulta;
        JSONObject data = new JSONObject();

        try {
            c = cnx.getConnection();
            consulta = "SELECT * FROM contactos "
                    + "WHERE nombres LIKE ? "
                    + "OR apellidos LIKE ? "
                    + "OR tel1 LIKE ? "
                    + "OR tel2 LIKE ?";

            stmt = c.prepareStatement(consulta);

            stmt.setString(1, "%" + buscar + "%");
            stmt.setString(2, "%" + buscar + "%");
            stmt.setString(3, "%" + buscar + "%");
            stmt.setString(4, "%" + buscar + "%");

            resultado = stmt.executeQuery();

            int bandera = 0;

            while (resultado.next()) {
                String[] datos = new String[7];

                datos[0] = resultado.getInt("id_contacto") + "";
                datos[1] = resultado.getString("nombres");
                datos[2] = resultado.getString("apellidos");
                datos[3] = resultado.getString("tel1");
                datos[4] = resultado.getString("tel2");
                datos[5] = resultado.getString("dir");
                datos[6] = resultado.getString("email");

//                JSONArray datosRow = new JSONArray();
//                datosRow.put(datos);
//                data.put(bandera + "", datosRow);
//                bandera++;
                data.put(bandera + "", datos);
                bandera++;
            }
        } catch (SQLException | JSONException e) {
            e.printStackTrace();
        }

        return data;
    }
}
