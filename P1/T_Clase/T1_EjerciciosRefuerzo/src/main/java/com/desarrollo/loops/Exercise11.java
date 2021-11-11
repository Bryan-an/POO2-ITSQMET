/*
    11. Construir un programa que pida el nombre de usuario y que lo imprima 20 veces
    en pantalla.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise11 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise11().askForName();
    }

    public void askForName() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese su nombre: ");
                datum = input.readLine();

                if (datum.isEmpty()) {
                    throw new Exception();
                }

                name = datum;
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printName();
    }

    public void printName() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name);
        }
    }

}
