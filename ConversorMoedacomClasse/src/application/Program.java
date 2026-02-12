package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dolar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        int quantity = sc.nextInt();

        double total = CurrencyConverter.conversor(dolar, quantity);

        System.out.printf("O valor que deverá ser pago é de: %.2f%n", total);

        sc.close();
    }
}
