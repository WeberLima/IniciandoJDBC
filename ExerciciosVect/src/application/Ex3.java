package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex3{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n= sc.nextInt();
        sc.nextLine();
        String[] vectName= new String[n];
        int[] vectAge= new int[n];
        double[] vectHeight= new double[n];
        double avg, sum=0;
        int less=0;
        for(int i=0;i<n;i++) {
            System.out.print("Nome: ");
        	vectName[i] = sc.nextLine();

            System.out.print("Idade: ");
        	vectAge[i] = sc.nextInt();
        	
            System.out.print("Altura: ");
        	vectHeight[i] = sc.nextDouble();
            sc.nextLine();

        	sum += vectHeight[i];
        	if(vectAge[i]<16) {
        		less++;
        	}
        }
        double percentage = (double) less / n * 100;
        avg = sum / n;
        System.out.printf("Altura Média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percentage);
        
        for(int i=0;i<n;i++) {
        	if(vectAge[i]<16) {
              System.out.println(vectName[i]);
        	}
        }

       
        sc.close();
    }
}
