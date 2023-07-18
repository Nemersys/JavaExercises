package model.entities;

public class Teacher extends Human {

	private double salary;
	private String schoolName;
	private static int num = 0;
	private static int n;
	
	public Teacher() {
		num++; n = num;
	}
	
	public Teacher(String name, int age, String nationality, double salary, String schoolName) {
		super(name, age, nationality);
		this.salary = salary;
		this.schoolName = schoolName;
		num++; n = num;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}	
	
	@Override
	public String getResponsible() {
		return "Teach";
	}
	
	@Override
	public String toString() {
		return "Teacher#" + n +
				"\nName\t:" + getName() +
				"\nAge\t:" + getAge() +
				"\nNationality\t:" + getNationality() +
				"\nSalary\t:" + getSalary() +
				"\nSchool Name\t:" + getSchoolName() + "\n";
	}

	@Override
	public int getN() {
		// TODO Auto-generated method stub
		return 0;
	}

}
