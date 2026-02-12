package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of products: ");
		int n= sc.nextInt();
        List<Product> list = new ArrayList<>();

		for(int i = 1; i<=n;i++) {
			System.out.println("Product #"+ i +" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char value = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			Product prd;
			
			if(value == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				prd = new ImportedProduct(name, price, customFee);
				list.add(prd);

				
			}else if(value =='c') {
				Product p= new Product(name, price);
				list.add(p);
			}else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String dateStr = sc.nextLine();
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        LocalDate d01= LocalDate.parse(dateStr, fmt);
				Product p = new UsedProduct(name, price, d01);
				list.add(p);
			}
			
			

		}
		
		System.out.println("PRICE TAGS:");
		for(Product products: list ) {
			System.out.print(products.priceTag());
		}

	}

}
