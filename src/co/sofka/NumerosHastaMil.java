package co.sofka;

import java.util.Scanner;

public class NumerosHastaMil {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Escribe un Numero ");
        Scanner scX = new Scanner(System.in);
        try {
            x = Integer.valueOf(scX.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Hay un error");
        }

        do{
            System.out.println("Numero " +x);
            x = x+2;
        }while (x<1000);
    }
}
