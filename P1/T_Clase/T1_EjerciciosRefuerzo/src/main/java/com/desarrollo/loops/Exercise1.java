/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise1 {

    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int limit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise1().askPosition();
    }

    public void askPosition() {
        boolean valid = false;
        do {
            try {
                System.out.println("¿Hasta qué posición desea imprimir la serie?: ");
                limit = Integer.parseInt(input.readLine());

                if (limit < 3) {
                    throw new Exception();
                }

                System.out.println();

                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printSeries();

    }

    public void printSeries() {
        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i < limit; i++) {
            int aux = num2;
            num2 = num2 + num1;
            num1 = aux;

            System.out.println(num2);
        }
    }

}
