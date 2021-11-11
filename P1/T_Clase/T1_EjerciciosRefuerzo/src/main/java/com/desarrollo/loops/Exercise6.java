/*
    6. Realizar un programa que permita imprimir la sumatoria de todos los números
    impares del 0 al 100
 */
package com.desarrollo.loops;

/**
 *
 * @author Bryan
 */
public class Exercise6 {

    private int sum = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise6().printSum();
    }

    public void printSum() {
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }

        System.out.printf("La suma es: %d", sum);
    }

}
