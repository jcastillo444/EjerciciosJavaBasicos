package co.sofka;

import java.time.LocalDate;
import java.time.LocalTime;

public class FechayHora {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        System.out.println(fecha + " " + hora);
    }
    }

