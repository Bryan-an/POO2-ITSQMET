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
public class Exercise3 {

    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise3().askAge();
    }

    public void askAge() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese su edad: ");
                age = Integer.parseInt(input.readLine());

                if (age < 0 || age > 100) {
                    throw new Exception();
                }

                if (age >= 18) {
                    System.out.println("\nUsted es mayor de edad");
                } else {
                    System.out.println("\nUsted es menor de edad");
                }

                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);
    }

}
