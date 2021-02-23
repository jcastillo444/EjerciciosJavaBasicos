package co.sofka;

import java.util.Scanner;

public class PalabrasIgualesoDiferentes {
    public static void main(String[] args) {
        String texto;
        String texto2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primera frase ");
        texto = scan.nextLine();
        System.out.println("Ingrese segunda frase ");
        texto2 = scan.nextLine();
        if (texto.equals(texto2)) {
            System.out.println("Las frases son iguales");
        } else {
            try {
                for (int i = 0; i < texto.length(); i++) {

                    if (texto.charAt(i) != texto2.charAt(i)) {
                        System.out.println(" Las palabras no son iguales en el caracteres " + i);
                        System.out.println(" Caracter frase 1: " + texto.charAt(i));
                        System.out.println(" Caracter frase 2: " + texto2.charAt(i));
                    }
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Incompatibilidad de tamaños en las frases ");
            }
        }
    }
}