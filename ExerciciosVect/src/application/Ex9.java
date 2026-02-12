package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex9{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar");
        int n= sc.nextInt();
        
        String vectName[] = new String[n]; 
        int vectAge[] = new int[n]; 
        
        sc.nextLine(); 
        int moreOld=0;
        String moreOldName=null;
        for(int i =0; i<n;i++) {
            System.out.printf("Dados da %da pessoa%n", i+1);
            System.out.printf("Nome: ");
            vectName[i]=sc.nextLine();
            System.out.printf("Idade: ");
            vectAge[i]=sc.nextInt();
            sc.nextLine(); 

            if(vectAge[i]>moreOld) {
            	moreOld=vectAge[i];
            	moreOldName=vectName[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + moreOldName);
        sc.close();
    }
}
