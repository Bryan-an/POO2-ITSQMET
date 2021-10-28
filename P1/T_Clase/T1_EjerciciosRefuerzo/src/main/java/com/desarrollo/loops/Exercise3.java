/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise3 {

    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String phrase;
    private int vowelsCount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise3().askPhrase();
    }

    public void askPhrase() {
        boolean valid = false;

        do {
            try {
                System.out.println("Ingrese la frase: ");
                phrase = input.readLine();
                System.out.println();
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printVowelsNumber();
    }

    public void printVowelsNumber() {
        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a'
                    || phrase.charAt(i) == 'e'
                    || phrase.charAt(i) == 'i'
                    || phrase.charAt(i) == 'o'
                    || phrase.charAt(i) == 'u') {

                vowelsCount++;
            }
        }

        System.out.printf("Hay %d vocales", vowelsCount);
    }

}
