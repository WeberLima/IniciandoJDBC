package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] vectHeight = new double[n];
        String[] vectGender = new String[n];

        double shorter = 0, tallest = 0;
        double sum = 0.0;
        double avg = 0.0;
        int females = 0, males = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            vectHeight[i] = sc.nextDouble();
            sc.nextLine(); 

            String genero;
            do {
                System.out.print("Genero da " + (i + 1) + "a pessoa (F/M): ");
                genero = sc.nextLine().toUpperCase();
            } while (!genero.equals("F") && !genero.equals("M"));

            vectGender[i] = genero;

            if (i == 0) {
                shorter = vectHeight[i];
                tallest = vectHeight[i];
            } else {
                if (vectHeight[i] > tallest) {
                    tallest = vectHeight[i];
                }
                if (vectHeight[i] < shorter) {
                    shorter = vectHeight[i];
                }
            }

            if (genero.equals("F")) {
                sum += vectHeight[i];
                females++;
            } else {
                males++;
            }
        }

        if (females > 0) {
            avg = sum / females;
        }

        System.out.println("Menor altura = " + shorter);
        System.out.println("Maior altura = " + tallest);
        System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
        System.out.println("Numero de homens = " + males);

        sc.close();
    }
}
