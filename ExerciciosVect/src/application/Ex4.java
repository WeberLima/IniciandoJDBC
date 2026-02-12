package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex4{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n= sc.nextInt();
        
        int[] vect= new int[n];
        int quantity=0;
        for(int i =0;i<vect.length;i++) {
        	System.out.print("Digite um numero:");
        	vect[i]= sc.nextInt();
        	if(vect[i]%2==0) {
        		quantity++;
        	}
        }
	    System.out.println("\nNUMEROS PARES:");
        for (int i=0; i<vect.length; i++) {
      	        if (vect[i]%2==0) {
      	        	System.out.printf("%d ", vect[i]);
      	        }
      	    }
	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantity);

        
       

        sc.close();
    }
}
