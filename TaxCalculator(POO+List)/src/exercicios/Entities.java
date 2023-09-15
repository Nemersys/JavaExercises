package exercicios;

public class Entities {
	
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Entities() {
		
	}
	
	public Entities(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public void increaseSalary(double percentage) {
        grossSalary += (grossSalary * percentage) / 100;
	}
	
	@Override
	public String toString() {
		return "employee: " + name + "\n" +
	           "updated salary: " + grossSalary + "\n";
		
	}
	

}
