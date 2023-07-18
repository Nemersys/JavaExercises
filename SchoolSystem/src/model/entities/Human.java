package model.entities;

public abstract class Human {
	
	private String name, nationality;
	private int age;
	
	public Human() {
		
	}
	
	public Human(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSkill(String skill) {
		
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setSalary(double nextDouble) {
	}
	
	public abstract String getResponsible();
	
	public abstract String toString();
	
	public abstract int getN();

	public abstract void setSchoolName(String schoolName);

	
}
