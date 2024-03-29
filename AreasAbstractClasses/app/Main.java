package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int shapeQ = sc.nextInt();
		
		for (int i = 1; i <= shapeQ; i++) {
			System.out.println("Rectangle or Circle? (r/c)");
			char shape = sc.next().charAt(0);
			System.out.println("color:");
			Color color = Color.valueOf(sc.next());
			if (shape == 'r') {
				System.out.println("width: ");
				double width = sc.nextDouble();
				System.out.println("height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
				
			} else {
				System.out.println("radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			}
		}
		
		System.out.println();
		System.out.println("SHAPRE AREAS: ");
		for (Shape shape : list) {
			System.out.println(shape.area());		
		}
		
		sc.close();

	}

}
