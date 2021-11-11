/*
    20. Construir un sistema que permita repetir las veces que desee el usuario mostrar
    un menú de opciones.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise20 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int times;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise20().askForTimes();
    }

    public void askForTimes() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese el número de veces que desea mostar el menú: ");
                times = Integer.parseInt(input.readLine());

                if (times > 0) {
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printMenu();
    }

    public void printMenu() {
        String menu = "\nMenu de opciones\n1. Opción 1\n2. Opción 2\n3. Opción 3";

        for (int i = 0; i < times; i++) {
            System.out.println(menu);
        }
    }

}
