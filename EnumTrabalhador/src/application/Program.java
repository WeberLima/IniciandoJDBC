package application;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;




public class Program{

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter department's name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name");
        String workerName = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary:");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel.toUpperCase()), baseSalary, new Department(departmentName));
        System.out.print("How many contracts to this worker:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter contract #"+i+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String data1 = sc.nextLine();
			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contratct= new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contratct);
            
          

            

        }
        System.out.println();
        System.out.print("Enther month and year to calculate income (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+ monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        

        sc.close();
	}
	
	
	
	

}
