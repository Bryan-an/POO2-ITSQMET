/*
    13. Crear un programa que solicite al usuario ingresar una letra, imprimir:
    a. Si ingresó una vocal: “Es un vocal”
    b. Si ingresó una letra distinta a una vocal: “No es una vocal”
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise13 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private char letter;
    private boolean vowel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise13().askForLetter();
    }

    public void askForLetter() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese una letra: ");
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

        vowel = isVowel();
        printResult();
    }

    public boolean isVowel() {
        return String.valueOf(letter).matches("[aeiou]");
    }

    public void printResult() {
        String message = vowel ? "es" : "no es";

        System.out.printf("\nLa letra %s %s una vocal", letter, message);
    }

}
