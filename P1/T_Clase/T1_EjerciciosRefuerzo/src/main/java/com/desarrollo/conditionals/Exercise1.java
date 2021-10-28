/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author Bryan
 */
public class Exercise1 {

    private double grade1;
    private double grade2;
    private double grade3;
    private double average;
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private final DecimalFormat formatter = new DecimalFormat("0.00");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise1().askGrades();
    }

    public void askGrades() {
        grade1 = askGrade();
        grade2 = askGrade();
        grade3 = askGrade();

        calculateAverage();
    }

    public void calculateAverage() {
        average = (grade1 + grade2 + grade3) / 3;

        showResult();
    }

    public void showResult() {
        String message = average < 7 ? "\nReprobado" : "\nAprobado";

        System.out.println("\nPromedio: " + formatter.format(average) + message);
    }

    public double askGrade() {
        boolean valid = false;
        double number = 0;
        int index = 1;

        do {
            try {
                System.out.println("\nIngrese la calificación " + index + ": ");
                number = Double.parseDouble(input.readLine());
                if (number >= 1 && number <= 10) {
                    index++;
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        return number;
    }

}
