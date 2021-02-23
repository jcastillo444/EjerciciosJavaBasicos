package co.sofka;

import java.util.Scanner;

public class EliminoEspacios {
    public static void main(String[] args) {
        String frase = "";

        System.out.println("Escribe una frase ");
        Scanner scFrase = new Scanner(System.in);
        frase = String.valueOf(scFrase.nextLine());

        System.out.println(frase.replaceAll("\\s",""));
    }
}
