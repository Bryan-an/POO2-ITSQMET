/*
 * 2. Hacer un sistema para una tienda de gafas de sol, el cual necesita como
parámetros de entrada la cantidad y el precio. Al pagar el total de la factura el
sistema debe considerar:
a. Si el monto total es superior a $85 tiene un descuento del 10% del total
de la factura
b. Si el monto total es superior a $100 tiene un descuento del 15% del total
de la factura
49
c. Si el monto total es superior a $115 tiene un descuento del 20% del total
de la factura
 */
package com.desarrollo.conditionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author Bryan
 */
public class Exercise2 {

    private double amount;
    private double price;
    private double total;
    private double discount = 0;
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private final DecimalFormat formatter = new DecimalFormat("0.00");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise2().askForData();
    }

    public void askForData() {
        askForAmount();
        askForPrice();
        calculateTotal();
    }

    public void askForAmount() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese la cantidad: ");
                amount = Integer.parseInt(input.readLine());

                if (amount < 1) {
                    throw new Exception();
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);
    }

    public void askForPrice() {
        boolean valid = false;
        String datum;

        do {
            try {
                System.out.println("\nIngrese el precio: ");
                datum = input.readLine();

                if (datum.matches("\\d+(\\.\\d{1,2})?")) {
                    price = Double.parseDouble(datum);
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);
    }

    public void calculateTotal() {
        total = amount * price;

        setDiscount();

        total = total * ((100 - discount) / 100);

        if (discount != 0) {
            System.out.printf("\nDescuento: %d%% \n", (int) discount);
        } else {
            System.out.println("\nUsted no recibió descuento");
        }

        System.out.printf("Total: $ %s \n", formatter.format(total));

    }

    public void setDiscount() {
        if (total > 100) {
            discount = 15;
        } else if (total > 85) {
            discount = 10;
        }
    }
}
