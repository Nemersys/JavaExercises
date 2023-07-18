package model.entities;

public class Student extends Human {

	private String schoolName, skill;
	private static int num = 0;
	private static int n;
	
	public Student() {
		num++; n = num;
	}
	
	public Student(String name, int age, String nationality, String schoolName, String skill) {
		super(name, age, nationality);
		this.schoolName = schoolName;
		this.skill = skill;
		num++; n = num;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}	
	
	public int getN() {
		return n;
	}
	
	@Override
	public String getResponsible() {
		return "Study";
	}
	
	@Override
	public String toString() {
		return "student#" + n +
				"\nName\t:" + getName() +
				"\nAge\t:" + getAge() +
				"\nNationality\t:" + getNationality() +
				"\nSchool Name\t:" + getSchoolName() +
				"\nSkill\t:" + getSkill() + "\n";
	}

}
