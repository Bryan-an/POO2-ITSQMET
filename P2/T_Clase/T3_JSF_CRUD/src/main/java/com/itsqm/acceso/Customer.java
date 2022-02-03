/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itsqm.acceso;

import com.itsqm.modelo.Conexion;

/**
 *
 * @author Bryan
 */
public class Customer {

    private int id;
    private String name;
    private String lastName1;
    private String lastName2;
    private String phone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String insertCustomer(String name, String lastName1, String lastName2, String phone, String email) {
        this.setName(name);
        this.setLastName1(lastName1);
        this.setLastName2(lastName2);
        this.setPhone(phone);
        this.setEmail(email);

        String query = "INSERT INTO customers (`name`, `lastname1`, `lastname2`, `phone`, `email`) VALUES ('"
                + getName() + "', '"
                + getLastName1() + "', '"
                + getLastName2() + "', '"
                + getPhone() + "', '"
                + getEmail() + "')";

        return new Conexion().ejecutar(query);
    }

}
