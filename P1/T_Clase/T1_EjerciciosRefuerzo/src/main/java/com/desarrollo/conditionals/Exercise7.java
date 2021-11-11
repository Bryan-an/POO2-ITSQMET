/*
    7. Solicitar al usuario ingresar dos números: mostrar y controlar lo siguiente:
    a. Controlar que sean dos números distintos
    b. Mostrar cual de los dos es mayor
    c. Mostrar al menor
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise7 {

    private int num1;
    private int num2;
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise7().askForNumbers();
    }

    public void askForNumbers() {
        num1 = askForNumber();

        do {
            num2 = askForNumber();
        } while (areEqual());

        showResults();
    }

    public int askForNumber() {
        while (true) {
            try {
                System.out.println("\nIngrese un número: ");
                return Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        }
    }

    public boolean areEqual() {
        boolean equal = num1 == num2;

        if (equal) {
            System.out.println("\nLos números no pueden ser iguales");
        }

        return equal;
    }

    public void showResults() {
        int greater = num1 > num2 ? num1 : num2;
        int less = num1 < num2 ? num1 : num2;

        System.out.printf("\nEl %d es el número mayor", greater);
        System.out.printf("\nEl %d es el número menor", less);
    }
}
