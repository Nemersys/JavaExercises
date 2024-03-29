package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
			
		System.out.println("quantos?");
		int q = sc.nextInt();
			
		for (int i = 0; i < q; i++) {			
			System.out.println("terceirizado? (y/n)");
			char terc = sc.next().charAt(0);
			System.out.println("nome:");
			String name = sc.next();
			System.out.println("horas trabalhadas:");
			int hours = sc.nextInt();
			System.out.println("valor por hora:");
			double valuePerHour = sc.nextDouble();
			
			if (terc == 'y') {
				System.out.println("add charge: ");
				double additionalCharge = sc.nextDouble();
					
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				lista.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				lista.add(emp);
			}
		}
			
		for (Employee i : lista) {
			System.out.println(i);
			System.out.println("pagamento:" + i.payment());
				
			sc.close();
	    }
    }
}

