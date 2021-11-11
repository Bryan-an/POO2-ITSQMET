/*
    12. Realizar un programa que pida al usuario su edad como numero entero positivo
    y que imprima todos los números desde el cero hasta su edad en pantalla
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise12 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise12().askForAge();
    }

    public void askForAge() {
        boolean valid = false;
        int datum;

        do {
            try {
                System.out.println("\nIngrese su edad: ");
                datum = Integer.parseInt(input.readLine());

                if (datum > 0 && datum < 100) {
                    age = datum;
                    valid = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printNumbers();
    }

    public void printNumbers() {
        for (int i = 0; i <= age; i++) {
            System.out.println(i);
        }
    }

}
