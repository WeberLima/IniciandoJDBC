package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex2{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n= sc.nextInt();
        
        int[] vect= new int[n];
        int sum=0;
        for(int i =0;i<vect.length;i++) {
        	System.out.print("Digite um numero:");
        	vect[i]= sc.nextInt();
        	sum += vect[i];
        }
        double avg = (double) sum/vect.length;
    	System.out.printf("Soma = %d%n", sum);
    	System.out.printf("MEDIA = %.2f%n", avg);


        sc.close();
    }
}
