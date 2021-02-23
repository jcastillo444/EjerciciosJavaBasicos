package co.sofka;

import java.util.Scanner;

public class LongitudyVocales {
    public static void main(String[] args) {
        String frase = "";
        int contador = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.println("Escribe una frase ");
        Scanner scFrase = new Scanner(System.in);
        frase = String.valueOf(scFrase.nextLine());

        for (int x = 0; x < frase.length(); x++) {
            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e')
               || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o')
               || (frase.charAt(x) == 'u')) {
                if (frase.charAt(x)=='a'){
                    a++;
                }
                if (frase.charAt(x)=='e'){
                    e++;
                }
                if (frase.charAt(x)=='i'){
                    i++;
                }
                if (frase.charAt(x)=='o'){
                    o++;
                }
                if (frase.charAt(x)=='u'){
                    u++;
                }
            }
            System.out.println("La frase tiene una longitud de "+ frase.length());
            System.out.println("La palabra " + frase+"tiene"+contador+" vocales");
            System.out.println("De vocales a hay "+a);
                    System.out.println("De vocales e hay "+e);
                            System.out.println("De vocales i hay "+i);
                                    System.out.println("De vocales o hay "+o);
                                            System.out.println("De vocales u hay "+u);
            }
        }

    }
