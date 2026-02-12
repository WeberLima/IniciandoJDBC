package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex6{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai ter cada vetor? ");
        int n= sc.nextInt();
        
        int[] VectA= new int[n];
        int[] VectB= new int[n];
        int[] VectC= new int[n];
    	System.out.println("Digite os valores do vetor A");
        for(int i =0;i<VectA.length;i++) {
        	VectA[i]= sc.nextInt();
        } 
        
    	System.out.println("Digite os valores do vetor B");
        for(int i =0;i<VectB.length;i++) {
        	VectB[i]= sc.nextInt();
        } 
        
        for(int i =0;i<VectC.length;i++) {
        	VectC[i]= VectA[i]+VectB[i] ;
        }
        System.out.println("Vetor Resultante: " );

        for(int i =0;i<VectC.length;i++) {
            System.out.println(VectC[i]);
        } 


        
       

        sc.close();
    }
}
