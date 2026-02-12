package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rent;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rent[] vect = new rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpar buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine(); 

            vect[roomNumber] = new rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
