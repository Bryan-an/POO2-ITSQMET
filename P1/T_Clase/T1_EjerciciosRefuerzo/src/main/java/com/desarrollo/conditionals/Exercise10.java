/*
    10.Crear un programa en el cual se pida al usuario ingresar un numero con el fin
    de:
    a. Determinar si ese numero es par o impar
    b. Imprimir el resultado en consola
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise10 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int number;
    private boolean pair;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise10().askForNumber();
    }

    public void askForNumber() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese un número entero: ");
                number = Integer.parseInt(input.readLine());

                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        pair = isPair();
        printResult();
    }

    public boolean isPair() {
        return number % 2 == 0;
    }

    public void printResult() {
        String message = pair ? "par" : "impar";

        System.out.printf("\nEl número %d es %s", number, message);
    }

}
