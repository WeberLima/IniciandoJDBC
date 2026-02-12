package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();
			String item = br.readLine();
			List<Employee> list = new ArrayList<>();
			while(item != null) {
				String[] fields = item.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				item = br.readLine();
			}
			
			list.stream()
			.filter(p -> p.getSalary() > salary)
			.map(Employee::getEmail)
			.sorted()
			.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(p -> p.getName().toLowerCase().startsWith("m"))
					.mapToDouble(Employee::getSalary)
					.sum();
			System.out.println("Sum of salaries (names starting with M): " + sum);

			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}


}

}