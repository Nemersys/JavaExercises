package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Entities> list = new ArrayList<>();
		
		System.out.println("how many employees?");
		int emps = sc.nextInt();
		
		for (int i = 0; i < emps; i++) {
		
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("salary: ");
		double grossSalary = sc.nextDouble();
		System.out.println("tax: ");
		double tax = sc.nextDouble();
		
		Entities entities = new Entities(name, grossSalary, tax);
		entities.increaseSalary(tax);
		
		list.add(entities);
		
		}
		
		for (Entities entities : list) {
			System.out.println(entities.toString());	

	    }
		
		sc.close();
    }
}
