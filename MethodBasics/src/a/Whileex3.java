package a;

import java.util.Scanner;

public class Whileex3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int valor = sc.nextInt();
		int a=0;
		int b=0;
		int c=0;
		int d=0;

		while(valor != 4) {
			if (valor == 1) {
				a+=1;
			}
			if (valor == 2) {
				b +=1;
			}
			if (valor == 3) {
				c +=1;
			}
			valor = sc.nextInt();

		}
		System.out.print("Muito Obrigado\n");
		System.out.printf("Alcool: %d\n", a);
		System.out.printf("Gasolina: %d\n", b);
		System.out.printf("Diesel: %d\n", c);
	}

}
