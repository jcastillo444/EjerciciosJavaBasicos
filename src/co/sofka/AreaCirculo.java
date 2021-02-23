package co.sofka;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double radio = 0;
        double area = 0;

        System.out.println("Ingrese el radio del circulo en centimetros");
        Scanner scradio = new Scanner(System.in);


        try {
            radio = Double.parseDouble(scradio.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Error ingrese un numero");
        }
        area = Math.PI * Math.pow(radio,2);

        System.out.println("El area del circulo es " + area + "cm");
    }
    }
