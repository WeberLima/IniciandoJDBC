package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex7{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor");
        int n= sc.nextInt();
        
        double[] Vect= new double[n];
        double sum =0;
        double media=0;
        for(int i =0;i<Vect.length;i++) {
        	System.out.printf("Digite um número: ");
        	Vect[i]=sc.nextDouble();
        	sum+=Vect[i];
        } 
        media = sum/n;
    	System.out.printf("Media do vetor: %.3f\n", media);
    	System.out.println("Elementos abaixo da media:");
    	for(int i =0;i<Vect.length;i++) {
        	if(Vect[i]<media) {
            	System.out.println(Vect[i]);
        	}
        }


        
       

        sc.close();
    }
}
