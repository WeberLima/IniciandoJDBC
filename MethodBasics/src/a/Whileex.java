package a;

import java.util.Scanner;

public class Whileex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva a senha correta");
		int senha = sc.nextInt();
		while(senha != 2002) {
			System.out.print("Senha incorreta\n");
			System.out.print("Escreva a senha correta");
			senha = sc.nextInt();
		}
		System.out.print("Acesso permitido");

		
	}

}
