/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise11 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String s1;
    private String s2;
    private boolean equal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise11().askForSentences();
    }

    public void askForSentences() {
        s1 = askForSentence();
        s2 = askForSentence();

        equal = areEqual();
        printResult();
    }

    public String askForSentence() {
        while (true) {
            try {
                System.out.println("\nIngrese una cadena de texto: ");
                return input.readLine();
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        }
    }

    public boolean areEqual() {
        return s1.equals(s2);
    }

    public void printResult() {
        String message = equal ? "iguales" : "distintas";

        System.out.printf("\nCadenas %s", message);
    }

}
