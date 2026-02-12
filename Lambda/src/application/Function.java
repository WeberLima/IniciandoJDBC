package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;
import util.UppercaseName;



public class Function{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Godaci", 99.90));
		double factor = 1.1;
		
		List<String> names=list.stream().map(new UppercaseName()).collect(Collectors.toList());
		
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		
		list.removeIf(p -> p.getPrice()>= 100.0);
		list.forEach(System.out::println);

}

}