/*
    15.Construir un programa que solicite al usuario un número entero positivo y que
    imprima hacia abajo y acumulando por pasada un asterisco, de manera que el
    resultado se vería así
    *
    **
    ***
    ****
    *****
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise15 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int num;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise15().askForNumber();
    }

    public void askForNumber() {
        boolean valid = false;
        int datum;

        do {
            try {
                System.out.println("\nIngrese un número entero positivo: ");
                datum = Integer.parseInt(input.readLine());

                if (datum <= 0) {
                    throw new Exception();
                }

                num = datum;
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printAsterisks();
    }

    public void printAsterisks() {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
