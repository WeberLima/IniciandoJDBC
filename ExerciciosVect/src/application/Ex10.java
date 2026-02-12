package application;

import java.util.Locale;
import java.util.Scanner;


public class Ex10{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados");
        int n= sc.nextInt();
        
        String vectName[] = new String[n]; 
        double vectNota1[] = new double[n]; 
        double vectNota2[] = new double[n]; 
        sc.nextLine();

        for(int i =0; i<n;i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
            vectName[i]=sc.nextLine();
            vectNota1[i]=sc.nextDouble();
            vectNota2[i]=sc.nextDouble();
            sc.nextLine();

           
        }
        System.out.println("Alunos aprovados:");

        for(int i =0; i<n;i++) {
            double media = (vectNota1[i] + vectNota2[i]) / 2.0;
           if(media>=6) {
               System.out.println(vectName[i]);

           }
            
           
        }
        
        sc.close();
    }
}
