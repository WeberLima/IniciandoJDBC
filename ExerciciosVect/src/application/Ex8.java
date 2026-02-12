package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex8{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor");
        int n= sc.nextInt();
        sc.nextLine();
        double[] Vect= new double[n];
        int sum =0;
        double media=0;
        int quantity=0;
        for(int i =0;i<Vect.length;i++) {
        	System.out.printf("Digite um número: ");
        	Vect[i]=sc.nextInt();
        	if(Vect[i]%2==0) {
        		sum+=Vect[i];
        		quantity++;
        	}

        } 
    	media = (double) sum/quantity;
    	if(quantity==0) {
        	System.out.printf("Nenhum numero par");

    	}else {
        	System.out.printf("Media dos pares %.1f", media);

    	}



        
       

        sc.close();
    }
}
