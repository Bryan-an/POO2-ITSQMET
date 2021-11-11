/*
    9. Solicitar al usuario que ingrese un numero del 1 al 7, imprimir:
    a. Si ingresa 1: imprimir Lunes
    b. Si ingresa 2: imprimir Martes
    c. Si ingresa 3: imprimir Miércoles
    d. Si ingresa 4: imprimir Jueves
    e. Si ingresa 5: imprimir Viernes
    f. Si ingresa 6: imprimir Sábado
    g. Si ingresa 7: imprimir Domingo
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise9 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int number;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise9().askForNumber();
    }

    public void askForNumber() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese un número del 1 al 7: ");
                number = Integer.parseInt(input.readLine());

                if (number >= 1 && number <= 7) {
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        printDay();
    }

    public void printDay() {
        switch (number) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miércoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sábado");
            case 7 ->
                System.out.println("Domingo");
        }
    }

}
