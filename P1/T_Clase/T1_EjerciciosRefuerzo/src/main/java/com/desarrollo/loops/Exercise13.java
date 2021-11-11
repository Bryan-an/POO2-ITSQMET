/*
    13. Construir un programa que pida al usuario su color favorito, hallar la longitud
    de ese color e imprimir en pantalla todos los números pares desde el cero hasta
    la longitud del color.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise13 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String color;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise13().askForColor();
    }

    public void askForColor() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese su color favorito: ");
                datum = input.readLine();

                if (datum.isEmpty()) {
                    throw new Exception();
                }

                color = datum;
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printPairNumbers();
    }

    public void printPairNumbers() {
        for (int i = 0; i <= color.length(); i += 2) {
            System.out.println(i);
        }
    }

}
