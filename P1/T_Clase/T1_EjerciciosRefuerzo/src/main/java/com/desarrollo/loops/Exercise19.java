/*
    19. Construir un programa que pida al usuario su fecha de nacimiento. Imprimir en
    pantalla que edad tiene exactamente hasta la fecha actual
 */
package com.desarrollo.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Bryan
 */
public class Exercise19 {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private String birthdate;
    private LocalDate birth;
    private final LocalDate now = LocalDate.now(ZoneId.of("America/Guayaquil"));
    private long age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Exercise19().askBirthdate();
    }

    public void askBirthdate() {
        boolean valid = false;

        do {
            try {
                System.out.println("\nIngrese su fecha de cumpleaños (dd-mm-aaaa): ");
                birthdate = input.readLine();

                if (birthdate.matches("\\d{2}-\\d{2}-\\d{4}")) {
                    birth = LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nDato inválido");
            }
        } while (!valid);

        calculateAge();
    }

    public void calculateAge() {
        age = ChronoUnit.YEARS.between(birth, now);
        System.out.printf("\nEdad: %d años", age);
    }

}
