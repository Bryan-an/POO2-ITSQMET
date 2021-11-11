/*
    18. Realizar un programa que pida al usuario ingresar una frase y luego una letra
    con el fin de imprimir en pantallas cuantas veces se encontró esa letra en la
    frase.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise18 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String phrase;
    private char letter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise18().askForPhrase();
    }

    public void askForPhrase() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese una frase: ");
                datum = input.readLine();

                if (datum.isEmpty()) {
                    throw new Exception();
                }

                phrase = datum;
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        askForLetter();
    }

    public void askForLetter() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese la letra que desea buscar en la frase: ");
                datum = input.readLine().toLowerCase();

                if (datum.matches("[a-zñ]")) {
                    letter = datum.charAt(0);
                    valid = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printResult();
    }

    public void printResult() {
        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == letter) {
                count++;
            }
        }

        System.out.printf("\nSe encontro %d vez/ces la letra '%s' en la frase \"%s\"", count, letter, phrase);
    }

}
