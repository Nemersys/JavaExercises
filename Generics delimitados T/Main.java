package prova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercicio {

	public static void main(String[] args) {
		
		String patch = "C:\\Users\\Pichau\\Desktop\\produtos.txt";
		
		List<Product> list = new ArrayList<>();
		
		
        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {
        	
        	String line = br.readLine();
        	while (line!= null) {
        		String[] fields = line.split(",");
        		list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        		line = br.readLine();
        	}
        	
        	Product x = CalcService.max(list);
        	System.out.println("most expensive product: ");
        	System.out.println(x);
        	
        } catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        }
     
    }
}