package a;

import java.util.Scanner;

public class whileex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Escreva o valor e X e Y\n");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.print("Primeiro\n");
			}
			if(x > 0 && y < 0) {
				System.out.print("Quarto\n");
			}
			if(x < 0 && y < 0) {
				System.out.print("Terceiro\n");
			}
			if(x < 0 && y > 0) {
				System.out.print("Segundo\n");
			}
			System.out.print("Escreva o valor e X e Y\n");
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}

}
