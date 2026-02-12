package application;

import java.util.Locale;
import java.util.Scanner;

import entities.account;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        String initial;
        account Account;
        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            initial = sc.nextLine().toLowerCase();
        } while (!initial.equals("y") && !initial.equals("n"));;
        if(initial.equals("y")) {
        	System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
        	 Account = new account(number, name, initialDeposit);
        }else{
        	 Account = new account(number, name);
        }
        System.out.println();
    	System.out.println("Account data: ");
    	System.out.println(Account);
    	
        System.out.println();
    	System.out.print("Enter a deposit value: ");
    	double deposit= sc.nextDouble();
    	Account.depositValue(deposit);
    	System.out.println("Updated account data: ");
    	System.out.println(Account);
        System.out.println();

    	System.out.print("Enter a withdraw value: ");
    	double withdraw= sc.nextDouble();
    	Account.withdrawValue(withdraw);
    	System.out.println("Updated account data: ");
    	System.out.println(Account);


        sc.close();
    }
}
