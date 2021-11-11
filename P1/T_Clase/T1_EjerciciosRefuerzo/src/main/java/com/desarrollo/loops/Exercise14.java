/*
    14. Realizar un sistema que pida a usuario un número entero positivo, imprimir en
    pantalla de forma ascendente los números a partir de ese número ingresado
    hasta el cero.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise14 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int num;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise14().askForNumber();
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

        printNumbers();
    }

    public void printNumbers() {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

}
