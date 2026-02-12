package application;

import java.util.Scanner;

import model.entitites.Account;
import model.exceptions.DomainExceptions;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Account data");
	    System.out.print("Number: ");
	    int number = sc.nextInt();
	    System.out.print("Holder: ");
	    String holder = sc.nextLine();
	    System.out.print("Initial balance: ");
	    double balance = sc.nextDouble();
	    System.out.print("withdraw limit: ");
	    double withdrawlimit = sc.nextDouble();
	    
	    Account acc = new Account(number, holder, balance, withdrawlimit);
	    
	    System.out.println("");
	    System.out.print("Enter the amount for withdraw: ");
	    double amount = sc.nextDouble();
	    
	    try {
	    acc.withdraw(amount);
	    System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
	    }catch(DomainExceptions e ) {
	    	System.out.println(e.getMessage());
	    }
		sc.close();
	}

}
