/*
    Ejercicio 8
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Bryan
 */
public class Exercise8 {

    Integer[] numbers = new Integer[3];
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise8().askForNumbers();
    }

    public void askForNumbers() {
        int number;

        for (int i = 0; i < numbers.length; i++) {
            do {
                number = askForNumber();
            } while (areEqual(number));

            numbers[i] = number;
        }

        showResults();
    }

    public int askForNumber() {
        while (true) {
            try {
                System.out.println("\nIngrese un número: ");
                return Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        }
    }

    public boolean areEqual(int number) {
//        System.out.println(Arrays.asList(numbers));
        boolean equal = Arrays.asList(numbers).contains(number);
//        System.out.println(equal);

        if (equal) {
            System.out.println("\nLos números no pueden ser iguales");
        }

        return equal;
    }

    public void showResults() {
        Arrays.sort(numbers);

        int greater = numbers[2];
        int less = numbers[0];

        System.out.printf("\nEl %d es el número mayor", greater);
        System.out.printf("\nEl %d es el número menor", less);
    }

}
