/*
 * 4. Realizar un sistema que permita dar descuento a clientes con membresía de
una tienda en línea de comida conociendo que:
a. Clientes con membresía A: 10% de descuento
b. Clientes con membresía B: 8% de descuento
c. Clientes con membresía C: 6% de descuento
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise4 {

    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private char type;
    private int discount;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise4().askType();
    }

    public void askType() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese su tipo de membresía: ");
                datum = input.readLine().toLowerCase();

                if (datum.matches("[abc]")) {
                    type = datum.charAt(0);
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Dato inválido");
            }
        } while (!valid);

        calculateDiscount();
    }

    public void calculateDiscount() {
        switch (type) {
            case 'a' ->
                discount = 10;
            case 'b' ->
                discount = 8;
            case 'c' ->
                discount = 6;
        }

        System.out.printf("\nDescuento: %d %%", (int) discount);
    }

}
