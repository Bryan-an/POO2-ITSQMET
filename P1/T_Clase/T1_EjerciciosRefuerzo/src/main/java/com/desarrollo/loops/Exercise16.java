/*
    16. Construir un programa que permita validar la contraseña ingresada por el
    usuario, es decir, debería solicitar:
    a. Ingreso de contraseña
    b. Confirmación de la contraseña
    c. Verificación de que las los contraseñas ingresadas sean las mismas
    d. Imprimir esta verificación
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bryan
 */
public class Exercise16 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String password;
    private String passwordConfirmation;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise16().askForData();
    }

    public void askForData() {
        do {
            password = askForPassword("\nIngrese una contraseña: ");
            passwordConfirmation = askForPassword("\nConfirme su contraseña: ");
        } while (!areTheSame());

        System.out.println("\nContraseña registrasda satisfactoriamente!!");
    }

    public String askForPassword(String message) {
        String datum;

        while (true) {
            try {
                System.out.println(message);
                datum = input.readLine();

                if (datum.isEmpty()) {
                    throw new Exception();
                }

                return datum;
            } catch (Exception e) {
                System.out.println("\nContraseña inválida");
            }
        }
    }

    public boolean areTheSame() {
        boolean equal = password.equals(passwordConfirmation);

        if (!equal) {
            System.out.println("\nLas contraseñas no coinciden");
        }
        return equal;
    }
}
