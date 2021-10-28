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
public class Exercise2 {

    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int number;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise2().askNumber();
    }

    public void askNumber() {
        boolean valid = false;

        do {
            try {
                System.out.println("¿Hasta qué posición desea imprimir la serie?: ");
                number = Integer.parseInt(input.readLine());
                System.out.println();
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printPairNumbers();
    }

    public void printPairNumbers() {

        for (int i = 0; i < 10; i++) {
            if (number % 2 == 0) {
                System.out.println(number);
                number += 2;
            } else {
                number++;
                i--;
            }
        }
    }
}
