package com.itsqm.acceso;

import com.itsqm.modelo.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author Bryan
 */
public class Contacto {

    private int id;
    private String n;
    private String a;
    private String t1;
    private String t2;
    private String d;
    private String e;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String insertarContacto(String n, String a, String t1, String t2, String d, String e) {
        this.setN(n);
        this.setA(a);
        this.setT1(t1);
        this.setT2(t2);
        this.setD(d);
        this.setE(e);

        String sql = "INSERT INTO "
                + "`contactos`"
                + "(`nombres`, `apellidos`, `tel1`, `tel2`, `dir`, `email`) "
                + "VALUES ('"
                + getN() + "','"
                + getA() + "','"
                + getT1() + "','"
                + getT2() + "','"
                + getD() + "','"
                + getE() + "')";

        Conexion c = new Conexion();
        String msj = c.ejecutar(sql);
        return msj;
    }

    public ResultSet consultar(String buscar) {
        ResultSet rs = null;
        String sql = "SELECT * FROM contactos "
                + "WHERE nombres LIKE '" + buscar
                + "' OR apellidos LIKE '" + buscar
                + "' OR tel1 LIKE '" + buscar
                + "' OR tel2 LIKE '" + buscar + "'";

        try {
            Conexion c = new Conexion();
            rs = c.consulta(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return rs;
    }

    public String eliminarContacto(int id) {
        this.setId(id);

        String sql = "DELETE FROM contactos "
                + "WHERE id_contacto = " + id;

        Conexion c = new Conexion();
        String msj = c.ejecutar(sql);
        return msj;
    }

    public String actualizarContacto(int id, String n, String a, String t1, String t2, String d, String e) {
        this.setId(id);
        this.setN(n);
        this.setA(a);
        this.setT1(t1);
        this.setT2(t2);
        this.setD(d);
        this.setE(e);

        String sql = "UPDATE `contactos` SET "
                + "`nombres`='" + getN() + "',"
                + "`apellidos`='" + getA() + "',"
                + "`tel1`='" + getT1() + "',"
                + "`tel2`='" + getT2() + "',"
                + "`dir`='" + getD() + "',"
                + "`email`='" + getE() + "' "
                + "WHERE `id_contacto`=" + getId();

        Conexion c = new Conexion();
        String msj = c.ejecutar(sql);
        return msj;
    }

}
