/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Bryan
 */
public class ClientesControlador {

    private int id;
    private String nombres;
    private String ruc;
    private String contacto;
    private String direccion;

    public ClientesControlador() {

    }

    public ClientesControlador(int id, String nombres, String ruc, String contacto, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.ruc = ruc;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    //toString
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
