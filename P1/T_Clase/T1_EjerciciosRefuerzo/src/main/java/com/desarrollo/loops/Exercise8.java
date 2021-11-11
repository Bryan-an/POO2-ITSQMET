/*
    8. Realizar un programa que pida al usuario un número entero positivo con el
    objetivo de:
    a. Mostrar el factorial de ese numero ingresado por el usuario
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise8 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int num;
    private int factorial = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise8().askForNumber();
    }

    public void askForNumber() {
        boolean valid = false;
        int datum;

        do {
            try {
                System.out.println("\nIngrese un número: ");
                datum = Integer.parseInt(input.readLine());

                if (datum >= 0) {
                    num = datum;
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printFactorial();
    }

    public void printFactorial() {
        if (num == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }

        System.out.printf("\nEl factorial es de %d es %d", num, factorial);
    }

}
