/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class Exercise9 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private final ArrayList<Integer> numbers = new ArrayList<Integer>();
    private double average;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise9().askForNumbers();
    }

    public void askForNumbers() {
        boolean more;

        do {
            numbers.add(askForNumber());
            more = askMoreNumbers();
        } while (more);

        calculateAverage();
    }

    public int askForNumber() {
        int num;

        while (true) {
            try {
                System.out.println("\nIngrese un número: ");
                num = Integer.parseInt(input.readLine());

                if (num < 0) {
                    throw new Exception();
                }

                return num;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        }
    }

    public boolean askMoreNumbers() {
        String answer;

        while (true) {
            try {
                System.out.println("\n¿Desea ingresar más números? (s/n): ");
                answer = input.readLine().toLowerCase();

                switch (answer) {
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

    public void calculateAverage() {
        average = ((double) numbers.stream().mapToInt(num -> num).sum()) / ((double) numbers.size());
        System.out.printf("\nEl promedio es: %f", average);
    }

}
