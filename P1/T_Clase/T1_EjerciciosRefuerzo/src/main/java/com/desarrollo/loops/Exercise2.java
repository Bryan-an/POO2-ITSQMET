/*
    2. Realizar un programa que permita mostrar la tabla de multiplicar de un número
    ingresado por teclado, tomando en cuenta lo siguiente:
    a. El usuario deberá indicar hasta que número de la tabla desea mostrar
    b. Los números ingresados únicamente deben ser enteros
    c. El sistema debe tener la capacidad de ejecutar el programa las veces
    que sean necesarias. Utilizar while para este punto.
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise2 {

    private boolean exit;
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int num;
    private int limit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise2().initApp();
    }

    public void initApp() {
        do {
            askForNumbers();
            exit = finish();
        } while (!exit);
    }

    public void askForNumbers() {
        num = askForNumber("\nIngrese el número del que desea mostrar la tabla de multiplicar: ");
        limit = askForNumber("\nIngrese hasta qué número desea imprimir la tabla de multiplicar: ");

        showMultiplicationTable();
    }

    public int askForNumber(String request) {
        while (true) {
            try {
                System.out.println(request);
                return Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        }
    }

    public void showMultiplicationTable() {
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.print(num * i);
            if (i != limit) {
                System.out.print(", ");
            }
        }
    }

    public boolean finish() {
        String datum;

        while (true) {
            try {
                System.out.println("\n\n¿Desea finalizar el programa? (s/n)");
                datum = input.readLine().toLowerCase();

                switch (datum) {
                    case "s" -> {
                        return true;
                    }
                    case "n" -> {
                        return false;
                    }
                    default ->
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        }
    }

}
