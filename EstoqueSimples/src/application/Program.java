package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
