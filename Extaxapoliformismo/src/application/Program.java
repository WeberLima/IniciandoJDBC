package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;




public class Program {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			System.out.print("Enter the number of tax payers: ");
			int n= sc.nextInt();
	        List<TaxPayer> list = new ArrayList<>();
	
			for(int i = 1; i<=n;i++) {
				System.out.println("Shape #"+ i +" data:");
				System.out.print("Individual or company (i/c)? ");
				char option = sc.next().charAt(0);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();
				TaxPayer tp;
				if(option == 'i') {
					System.out.print("Health expenditures: ");
					double healthExpenditures = sc.nextDouble();
				
					
					tp = new Individual(name, anualIncome, healthExpenditures);
					list.add(tp);
				}else {
					System.out.print("Number of Employees: ");
					int numberOfEmployees = sc.nextInt();
					tp = new Company(name, anualIncome, numberOfEmployees);
					list.add(tp);
				}
				

		}
			double sum =0;
			System.out.println();

			System.out.println("TAXES PAID: ");
			for(TaxPayer tp: list) {
				System.out.println(tp.getName()+": $"+String.format("%.2f", tp.tax()));
				sum += tp.tax();
			}
			
			System.out.println();
			System.out.println("TOTAL TAXES: $"+String.format("%.2f", sum));

	}
}