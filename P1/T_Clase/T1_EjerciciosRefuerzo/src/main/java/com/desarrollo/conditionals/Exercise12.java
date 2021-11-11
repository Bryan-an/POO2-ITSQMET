/*
    12. Crear un sistema de votación en el cual:
    a. Si elije al candidato A imprimir: “Usted ha votado por el candidato A”
    b. Si elije al candidato B imprimir: “Usted ha votado por el candidato B”
    c. Si elije al candidato C imprimir: “Usted ha votado por el candidato C”
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise12 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private char candidate;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise12().askForCandidate();
    }

    public void askForCandidate() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese el candidato por el que desea votar: ");
                datum = input.readLine().toLowerCase();

                if (datum.matches("[abc]")) {
                    candidate = datum.charAt(0);
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printSelection();
    }

    public void printSelection() {
        System.out.printf("\nUsted ha votado por el candidato %s", String.valueOf(candidate).toUpperCase());
    }

}
