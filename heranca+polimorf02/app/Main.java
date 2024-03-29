package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entender the number of products: ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println("product #" + i + "data: ");
			
			System.out.print("commom, used or imported? (c/u/i)" );
			
			char type = sc.next().charAt(0);
			
			if (type == 'c') {
				System.out.println("name: ");
				String name = sc.next();
				System.out.println("price: ");
				int price = sc.nextInt();
				
				list.add(new Product(name, price));
				
			} else if (type == 'u') {
				System.out.println("name: ");
				String name = sc.next();
				System.out.println("price: ");
				double price = sc.nextInt();
				System.out.println("manufacture date: DD/MM/YYYY ");
				sc.nextLine();
				String dateconv = sc.nextLine();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date date = sdf.parse(dateconv);
				
				list.add(new UsedProduct(name, price, date));
				
			} else {
				System.out.println("name: ");
				String name = sc.next();
				System.out.println("price: ");
				double price = sc.nextInt();
				System.out.println("custom fee: ");
				double fee = sc.nextInt();
				
				list.add(new ImportedProduct(name, price, fee));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
