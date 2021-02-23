package co.sofka;

public class NumerosParesImpares {
    public static void main(String[] args) {
        int x = 0;
        do {
            x = x + 1;
            if (x % 2 == 0) {
                System.out.println("El numero es par " + x);
            } else {
                System.out.println("El numero es impar " + x);
            }
        } while (x < 100);
    }
}