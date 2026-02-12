package application;

import java.util.Locale;
import java.util.Scanner;

public class Expensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?");
        int n=0;
        do {
            n = sc.nextInt();
            if(n<0 || n>9) {
                System.out.print("Please, type a number between 0-9");
            }
        }while(n<0 || n>9);

        String vectName[]= new String[n];
        String vectEmail[]= new String[n];
        int vectRoom[]= new int[n];
       
        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d%n", i + 1);

            sc.nextLine(); 
            System.out.print("Name: ");
            vectName[i] = sc.nextLine();

            System.out.print("Email: ");
            vectEmail[i] = sc.nextLine();

            System.out.print("Room: ");
            vectRoom[i] = sc.nextInt();

            boolean occupied = false;
            for (int j = 0; j < i; j++) {
                if (vectRoom[i] == vectRoom[j]) {
                    occupied = true;
                    break;
                }
            }

            if (occupied) {
                System.out.println("Room already occupied!");
                i--; 
            }
        }
        
        for (int i = 0; i < vectRoom.length - 1; i++) {
            for (int j = i + 1; j < vectRoom.length; j++) {

                if (vectRoom[i] > vectRoom[j]) {
                    int temp = vectRoom[i];
                    vectRoom[i] = vectRoom[j];
                    vectRoom[j] = temp;
                }

            }
        }
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < vectRoom.length; i++) {
            System.out.println(vectRoom[i]+vectName[i]+vectEmail[i]);
        }
        sc.close();
    }
}
