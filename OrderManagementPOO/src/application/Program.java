package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Clients;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String args[] ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter client data:");
	System.out.print("Name:");
	String name = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.nextLine();
	System.out.print("Birth date (DD/MM/YYYY): ");
	LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	Clients client = new Clients(name, email, birthDate);
	
	System.out.println("Enter order data:");
	System.out.print("Status: ");
	OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
	
	Order order = new Order(LocalDateTime.now(), status, client );
	System.out.print("How many items to this order? ");
	int n = sc.nextInt();
	for(int i=1; i<=n;i++) {
		System.out.println("Enter #"+i+" item data:");
		sc.nextLine();
		System.out.print("Product name: ");
		String nameItem = sc.nextLine();
		System.out.print("Product price: ");
		double price = sc.nextDouble();
		
		
		Product product = new Product(nameItem, price);
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		OrderItem orderItem = new OrderItem(quantity, price, product);
		
		order.addItem(orderItem);
	}
	System.out.print(order);
	sc.close();
	}
}
