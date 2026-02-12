package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;



public class Program {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			System.out.print("Enter the number of shapes: ");
			int n= sc.nextInt();
	        List<Shape> list = new ArrayList<>();
	
			for(int i = 1; i<=n;i++) {
				System.out.println("Shape #"+ i +" data:");
				System.out.print("Rectangle or Circle (r/c)? ");
				char shape = sc.next().charAt(0);
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());
				Shape sp;
				if(shape == 'r') {
					System.out.print("Width: ");
					double width = sc.nextDouble();
					System.out.print("Height: ");
	
					double height = sc.nextDouble();
					
					sp = new Rectangle(color, width, height);
					list.add(sp);
				}else {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					sp = new Circle(color, radius);
					list.add(sp);
				}
				
				
				
	
		}
			System.out.println();
			System.out.print("SHAPE AREAS: ");
			
			for(Shape shape: list) {
				System.out.println(String.format("%.2f", shape.area()));
			}

	}
}