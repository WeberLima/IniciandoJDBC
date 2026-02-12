package a;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero de 0-9, lembrando que o 0 é para sair da contagem ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num != 0){
		sum += num;
		
		System.out.print("Continue digitando um valor");
		num = sc.nextInt();
		}
		
		System.out.printf("Soma total %d", sum);
		
		sc.close();
	}

}
