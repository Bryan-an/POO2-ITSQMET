/*
    6. Solicitar a un usuario un número del 1 al 10, si el usuario ingreso un número
    igual al generado de forma aleatoria mostrar un “Ganaste” como mensaje,
    considerar:
    a. Usar Math para la generación de números aleatorios.
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise6 {

    private int number;
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise6().askForNumber();
    }

    public void askForNumber() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese un número de el 1 al 10: ");
                number = Integer.parseInt(input.readLine());

                if (number >= 1 && number <= 10) {
                    showResult();
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Dato inválido");
            }
        } while (!valid);
    }

    public void showResult() {
        int randomNumber = (int) (Math.random() * 10) + 1;

//        System.out.println(randomNumber);
        if (number == randomNumber) {
            System.out.println("\nGanaste");
        } else {
            System.out.println("\nPerdiste");
        }
    }

}
