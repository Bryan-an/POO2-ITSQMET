/*
    4. Realizar un programa que permita imprimir los 10 primeros números primos a
    partir del número ingresado por el usuario.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise4 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int start;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise4().askForNumber();
    }

    public void askForNumber() {
        boolean valid = false;
        int num;

        do {
            try {
                System.out.println("\nIngrese un número: ");
                num = Integer.parseInt(input.readLine());

                if (num > 1) {
                    start = num;
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printPrimeNumbers();
    }

    public void printPrimeNumbers() {
        int num = start;
        int dividersCount;

        for (int i = 0; i < 10; i++) {
            while (true) {
                dividersCount = 0;

                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        dividersCount++;
                    }
                }

                if (dividersCount == 2) {
                    System.out.printf("%d  ", num);
                    num++;
                    break;
                }

                num++;
            }
        }
    }

}
