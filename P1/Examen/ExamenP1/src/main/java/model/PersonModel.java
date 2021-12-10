/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.PersonController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class PersonModel {

    private final CDB cdb;
    private Statement statement;
    private ResultSet results;
    private Connection connection;

    public PersonModel() {
        cdb = new CDB();
    }

    public DefaultTableModel selectPeople(PersonController controller) {
        String query;
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Id");
        tableModel.addColumn("Cédula");
        tableModel.addColumn("Nombre 1");
        tableModel.addColumn("Nombre 2");
        tableModel.addColumn("Apellido 1");
        tableModel.addColumn("Apellido 2");
        tableModel.addColumn("Sexo");
        tableModel.addColumn("Fecha nacimiento");
        tableModel.addColumn("Lugar nacimiento");
        tableModel.addColumn("Edad");
        tableModel.addColumn("Nacionalidad");
        tableModel.addColumn("Teléfono móvil");
        tableModel.addColumn("Correo");
        tableModel.addColumn("Nombre Conyuge");
        tableModel.addColumn("C.I. Conyuge");
        tableModel.addColumn("Fecha nacimiento Conyuge");
        tableModel.addColumn("Ocupación Conyuge");
        tableModel.addColumn("Nombre Padre");
        tableModel.addColumn("C.I. Padre");
        tableModel.addColumn("Fecha nacimiento Padre");
        tableModel.addColumn("Ocupación Padre");
        tableModel.addColumn("Nombre Madre");
        tableModel.addColumn("C.I. Madre");
        tableModel.addColumn("Fecha nacimiento Madre");
        tableModel.addColumn("Ocupación Madre");
        String[] data = new String[25];

        try {
            connection = cdb.connect();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            query = "SELECT * FROM tpersona WHERE cedula LIKE '%" + controller.getSearch()
                    + "%' OR nombre1 LIKE '%" + controller.getSearch()
                    + "%' OR nombre2 LIKE '%" + controller.getSearch()
                    + "%' OR apellido1 LIKE '%" + controller.getSearch()
                    + "%' OR apellido2 LIKE '%" + controller.getSearch()
                    + "%'";

            results = statement.executeQuery(query);

            while (results.next()) {
                data[0] = results.getInt("idpersona") + "";
                data[1] = results.getString("cedula");
                data[2] = results.getString("nombre1");
                data[3] = results.getString("nombre2");
                data[4] = results.getString("apellido1");
                data[5] = results.getString("apellido2");
                data[6] = results.getString("sexo");
                data[7] = results.getString("fecha_nac");
                data[8] = results.getString("lugar_nac");
                data[9] = results.getInt("edad") + "";
                data[10] = results.getString("nacionalidad");
                data[11] = results.getString("t_movil");
                data[12] = results.getString("correo");
                data[13] = results.getString("nom_conyuge");
                data[14] = results.getString("naci_conyuge");
                data[15] = results.getString("fecha_nac_conyuge");
                data[16] = results.getString("ocupacion_conyuge");
                data[17] = results.getString("nom_padre");
                data[18] = results.getString("naci_padre");
                data[19] = results.getString("fecha_nac_padre");
                data[20] = results.getString("ocupacion_padre");
                data[21] = results.getString("nom_madre");
                data[22] = results.getString("naci_madre");
                data[23] = results.getString("fecha_nac_madre");
                data[24] = results.getString("ocupacion_madre");
                tableModel.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return tableModel;
    }

    public boolean insertPeople(PersonController controller) {
        boolean success = false;
        String query;

        try {
            connection = cdb.connect();
            statement = connection.createStatement();

            query = "INSERT INTO tpersona (cedula, nombre1, nombre2, apellido1, "
                    + "apellido2, sexo, fecha_nac, lugar_nac, edad, nacionalidad, "
                    + "t_movil, correo, nom_conyuge, naci_conyuge, "
                    + "fecha_nac_conyuge, ocupacion_conyuge, nom_padre, naci_padre, "
                    + "fecha_nac_padre, ocupacion_padre, nom_madre, naci_madre, "
                    + "fecha_nac_madre, ocupacion_madre) VALUES ('"
                    + controller.getDocument() + "', '"
                    + controller.getName1() + "', '"
                    + controller.getName2() + "', '"
                    + controller.getLastName1()
                    + "', '"
                    + controller.getLastName2()
                    + "', '"
                    + controller.getSex()
                    + "', '"
                    + controller.getBirthdate()
                    + "', '"
                    + controller.getPlaceOfBirth()
                    + "', "
                    + controller.getAge()
                    + ", '"
                    + controller.getNationality()
                    + "', '"
                    + controller.getCellphone()
                    + "', '"
                    + controller.getEmail()
                    + "', '"
                    + controller.getSpouseName()
                    + "', '"
                    + controller.getSpouseDocument()
                    + "', '"
                    + controller.getSpouseBirthdate()
                    + "', '"
                    + controller.getSpouseOccupation()
                    + "', '"
                    + controller.getFatherName()
                    + "', '"
                    + controller.getFatherDocument()
                    + "', '"
                    + controller.getFatherBirthdate()
                    + "', '"
                    + controller.getFatherOccupation()
                    + "', '"
                    + controller.getMotherName()
                    + "', '"
                    + controller.getMotherDocument()
                    + "', '"
                    + controller.getMotherBirthdate()
                    + "', '"
                    + controller.getMotherOccupation()
                    + "')";

            int result = statement.executeUpdate(query);

            success = result == 1;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return success;
    }

    public boolean updatePeople(PersonController controller) {
        boolean success = false;
        String query;

        try {
            connection = cdb.connect();
            statement = connection.createStatement();

            query = "UPDATE tpersona SET cedula = '"
                    + controller.getDocument()
                    + "', nombre1 = '"
                    + controller.getName1()
                    + "', nombre2 = '"
                    + controller.getName2()
                    + "', apellido1 = '"
                    + controller.getLastName1()
                    + "', apellido2 = '"
                    + controller.getLastName2()
                    + "', sexo = '"
                    + controller.getSex()
                    + "', fecha_nac = '"
                    + controller.getBirthdate()
                    + "', lugar_nac = '"
                    + controller.getPlaceOfBirth()
                    + "', edad = "
                    + controller.getAge()
                    + ", nacionalidad = '"
                    + controller.getNationality()
                    + "', t_movil = '"
                    + controller.getCellphone()
                    + "', correo = '"
                    + controller.getEmail()
                    + "', nom_conyuge = '"
                    + controller.getSpouseName()
                    + "', naci_conyuge = '"
                    + controller.getSpouseDocument()
                    + "', fecha_nac_conyuge = '"
                    + controller.getSpouseBirthdate()
                    + "', ocupacion_conyuge = '"
                    + controller.getSpouseOccupation()
                    + "', nom_padre = '"
                    + controller.getFatherName()
                    + "', naci_padre = '"
                    + controller.getFatherDocument()
                    + "', fecha_nac_padre = '"
                    + controller.getFatherBirthdate()
                    + "', ocupacion_padre = '"
                    + controller.getFatherOccupation()
                    + "', nom_madre = '"
                    + controller.getMotherName()
                    + "', naci_madre = '"
                    + controller.getMotherDocument()
                    + "', fecha_nac_madre = '"
                    + controller.getMotherBirthdate()
                    + "', ocupacion_madre = '"
                    + controller.getMotherOccupation()
                    + "' WHERE idpersona = " + controller.getId();

            int result = statement.executeUpdate(query);

            success = result == 1;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return success;
    }

    public boolean deletePeople(PersonController controller) {
        boolean success = false;
        String query;

        try {
            connection = cdb.connect();
            statement = connection.createStatement();
            query = "DELETE FROM tpersona WHERE idpersona = " + controller.getId();
            int result = statement.executeUpdate(query);

            success = result == 1;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return success;
    }
}
