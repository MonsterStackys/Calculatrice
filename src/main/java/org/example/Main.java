package org.example;

public class Main {

    public static void main(String[] args) {

        Calculatrice calc = new Calculatrice();

        int a = 10;
        int b = 5;

        System.out.println("Résultats de la calculatrice :");
        System.out.println("Addition : " + calc.addition(a, b));
        System.out.println("Soustraction : " + calc.soustraction(a, b));
    }
}
