package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import util.ProductPredicate;



public class Predicate{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Godaci", 99.90));

		list.removeIf(new ProductPredicate());
		
		for(Product p : list) {
			System.out.println(p);	
		}
}

}