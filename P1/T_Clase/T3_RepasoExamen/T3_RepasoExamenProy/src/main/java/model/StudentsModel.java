/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.StudentsController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class StudentsModel {

    private final CDB cdb;
    private Statement statement;
    private ResultSet results;
    private Connection connection;

    public StudentsModel() {
        cdb = new CDB();
    }

    public DefaultTableModel selectStudents(StudentsController sc) {
        String query;
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Id");
        tableModel.addColumn("Cédula");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Calificación 1");
        tableModel.addColumn("Calificación 2");
        tableModel.addColumn("Calificación 3");
        String[] data = new String[7];

        try {
            connection = cdb.connect();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            query = "SELECT * FROM students WHERE name LIKE '%" + sc.getSearch()
                    + "%' OR last_name LIKE '%" + sc.getSearch() + "%' OR document LIKE '%"
                    + sc.getSearch() + "%'";

            results = statement.executeQuery(query);

            while (results.next()) {
                data[0] = results.getInt("id") + "";
                data[1] = results.getString("document");
                data[2] = results.getString("name");
                data[3] = results.getString("last_name");
                data[4] = results.getDouble("grade_1") + "";
                data[5] = results.getDouble("grade_2") + "";
                data[6] = results.getDouble("grade_3") + "";
                tableModel.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return tableModel;
    }

    public boolean insertStudents(StudentsController sc) {
        boolean success = false;
        String query;

        try {
            connection = cdb.connect();
            statement = connection.createStatement();

            query = "INSERT INTO students (document, name, last_name, grade_1, grade_2, grade_3) VALUE ('"
                    + sc.getDocument() + "', '" + sc.getName() + "', '" + sc.getLastName()
                    + "', " + sc.getGrade1() + ", " + sc.getGrade2() + ", " + sc.getGrade3()
                    + ")";

            int result = statement.executeUpdate(query);

            success = result == 1;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return success;
    }

    public boolean updateStudents(StudentsController sc) {
        boolean success = false;
        String query;

        try {
            connection = cdb.connect();
            statement = connection.createStatement();

            query = "UPDATE students SET document = '" + sc.getDocument()
                    + "', name = '" + sc.getName() + "', last_name = '" + sc.getLastName()
                    + "', grade_1 = " + sc.getGrade1() + ", grade_2 = " + sc.getGrade2()
                    + ", grade_3 = " + sc.getGrade3() + " WHERE id = " + sc.getId();

            int result = statement.executeUpdate(query);

            success = result == 1;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return success;
    }

    public boolean deleteStudents(StudentsController sc) {
        boolean success = false;
        String query;

        try {
            connection = cdb.connect();
            statement = connection.createStatement();
            query = "DELETE FROM students WHERE id = " + sc.getId();
            int result = statement.executeUpdate(query);

            success = result == 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return success;
    }
}
