package co.sofka;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        String diaSemana;

        System.out.println("Escribe un día de la semana");
        Scanner scx = new Scanner(System.in);
        diaSemana = String.valueOf(scx.nextLine());
        diaSemana.toLowerCase();

        switch (diaSemana) {
            case "Sabado":
                System.out.println("Es dia de descanso");
                break;
            case "domingo":
                System.out.println("Es dia de descanso");
                break;
            default:
                System.out.println("Es dia laboral");
        }
    }
}