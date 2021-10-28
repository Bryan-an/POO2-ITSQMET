/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise2 {

    private int hours;
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int salary;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise2().askHours();
    }

    public void askHours() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese las horas de trabajo a la semana: ");
                hours = Integer.parseInt(input.readLine());

                if (hours < 0) {
                    throw new Exception();
                }

                if (hours <= 40) {
                    salary = 5;
                } else {
                    salary = 8;
                }

                System.out.printf("\nEl salario es de $ %d.00 la hora", salary);
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);
    }

}
