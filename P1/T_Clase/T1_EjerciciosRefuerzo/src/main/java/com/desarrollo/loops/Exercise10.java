/*
    10. Realizar un programa que muestre en pantalla los números ascendentes desde
    el uno hasta donde indique el usuario
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise10 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int limit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise10().askLimit();
    }

    public void askLimit() {
        boolean valid = false;
        int num;

        do {
            try {
                System.out.println("\nIngrese el número límite: ");
                num = Integer.parseInt(input.readLine());

                if (num <= 1) {
                    throw new Exception();
                }

                limit = num;
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printAscendingNumbers();
    }

    public void printAscendingNumbers() {
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.printf("%d  ", i);
        }
    }

}
