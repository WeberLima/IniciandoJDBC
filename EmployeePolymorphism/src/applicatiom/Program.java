package applicatiom;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the number of employees: ");
		int n= sc.nextInt();
        List<Employee> list = new ArrayList<>();

		for(int i =1; i<=n;i++) {
			System.out.println("Employee #"+ i +" data:");
			sc.nextLine();
			System.out.print("Outsourced (y/n)?");
			String outsourced = sc.nextLine().toLowerCase();
			while(outsourced.equals("n") && outsourced.equals("y")){
				System.out.println("Please type the right letter");
				System.out.println("Outsourced (y/n)?");
				outsourced = sc.nextLine();
			};
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour= sc.nextDouble();

			Employee emp;
			if(outsourced.equals("y")) {
				System.out.print("Additional charge:");
				double additionalCharge= sc.nextDouble();
				emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		
		}
		
		System.out.println("PAYMENTS:");
		for(Employee emp: list) {
			System.out.print(emp);
		}
		sc.close();
	}

}
