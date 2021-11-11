/*
    17. Construir un programa que pida al usuario ingresar una palabra por teclado,
    mostrar cada letra separadas por un salto de línea desde la ultima letra hasta la
    primera de la palabra.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise17 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String word;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise17().askForWord();
    }

    public void askForWord() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese una palabra: ");
                datum = input.readLine();

                if (datum.isEmpty()) {
                    throw new Exception();
                }

                word = datum;
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printReverseLetters();
    }

    public void printReverseLetters() {
        char[] reverseWord = new StringBuilder(word).reverse().toString().toCharArray();

        for (int i = 0; i < reverseWord.length; i++) {
            System.out.println(reverseWord[i]);
        }
    }

}
