package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex5{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n= sc.nextInt();
        
        int[] vect= new int[n];
        int biggest=0;
        int position=0;
        for(int i =0;i<vect.length;i++) {
        	System.out.print("Digite um numero:");
        	vect[i]= sc.nextInt();
        	if(vect[i]>biggest) {
        		biggest=vect[i];
        		position = i+1;
        	}
        } 
        System.out.printf("MAIOR VALOR = %d%n", biggest);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", position);

        
       

        sc.close();
    }
}
