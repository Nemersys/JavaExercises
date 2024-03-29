package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("quantas pessoas?");
		int qt = sc.nextInt();
		
		for (int i = 0; i < qt; i++) {
			
			System.out.println("Pessoa física ou jurídica? (f/j)");
			char fj = sc.next().charAt(0);
			
			if (fj == 'f') {
				
				System.out.println("nome: ");
				String nome = sc.next();
				System.out.println("renda: ");
				Double renda = sc.nextDouble();
				System.out.println("gastos: ");
				Double gastos = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, renda, gastos));
				
			} else {
				
				System.out.println("nome: ");
				String nome = sc.next();
				System.out.println("renda: ");
				Double renda = sc.nextDouble();
				System.out.println("funcionarios: ");
				Integer funcionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, renda, funcionarios));
			}
		}
		
		for (Pessoa pessoa : list) {
			System.out.println("Imposto pago por " + pessoa.getNome() + ":");
			System.out.println(pessoa.impostos());
		}
		
		sc.close();

	}
}
