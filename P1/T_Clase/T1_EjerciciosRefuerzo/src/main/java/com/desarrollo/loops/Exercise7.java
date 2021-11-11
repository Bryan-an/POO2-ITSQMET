/*
    7. Realizar un sistema que permita imprimir la sumatoria de los números múltiplos
    de siete entre en rango del cero a cien
 */
package com.desarrollo.loops;

/**
 *
 * @author Bryan
 */
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise7().printSum();
    }

    public void printSum() {
        for (int i = 7; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.printf("%d  ", i);
            }
        }
    }
}
