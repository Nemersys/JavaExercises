package Application;

import java.util.Scanner;

import model.entities.Human;
import model.entities.Student;
import model.entities.Teacher;

public class Main {
	static Human [] humans = new Human[10];
	static Scanner in = new Scanner(System.in);
	static int currentIndex = 0;
	
	public static void addStudent() {
		if (currentIndex < 10) {
		humans[currentIndex] = new Student();
		System.out.println("\nStudent#"+ humans[currentIndex].getN());
		System.out.print("Name\t\t: ");
		humans[currentIndex].setName(in.nextLine());
		System.out.print("Age\t\t: ");
		humans[currentIndex].setAge(in.nextInt());
		System.out.print("Nationality\t: ");
		humans[currentIndex].setNationality(in.next());
		System.out.print("School Name\t: ");
		humans[currentIndex].setSchoolName(in.next());
		System.out.print("Skill\t\t: ");
		humans[currentIndex].setSkill(in.next());
		currentIndex++;
		} else {
			System.out.println("cant add more");
		}
	}
	
	public static void addTeacher() {
		if (currentIndex < 10) {
		humans[currentIndex] = new Teacher();
		System.out.println("\nTeacher#"+ humans[currentIndex].getN());
		System.out.print("Name\t\t: ");
		humans[currentIndex].setName(in.nextLine());
		System.out.print("Age\t\t: ");
		humans[currentIndex].setAge(in.nextInt());
		System.out.print("Nationality\t: ");
		humans[currentIndex].setNationality(in.next());
		System.out.print("Salary\t\t: ");
		humans[currentIndex].setSalary(in.nextDouble());
		System.out.print("School Name\t: ");
		humans[currentIndex].setSchoolName(in.next());
		currentIndex++;
		} else {
			System.out.println("cant add more");
		}
	}
	
	public static int rsearchByName(String name) {
		for (int i = 0; i < humans.length; i++) {
			if(humans[i] != null) {
				if (humans[i].getName().equals(name)) return 1;{
				}
		    }
	    }
		return -1;
	}
	
	public static int editByName(String name) {
		for (int i = 0; i < humans.length; i++) {
			if(humans[i] != null) {
				if (humans[i].getName().equals(name)) return 1;{
				}
		    }
	    }
		return -1;
		
	}

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("1. add S");
			System.out.println("2. add T");
			System.out.println("3. srch S/T");
			System.out.println("4 edit S/T");
			System.out.println("5. display all");
			System.out.println("6. exit");
			System.out.println("choose an opt: ");
			int opt = in.nextInt(); in.nextLine();
			if (opt == 6) {
				System.out.println("-----");
				break;
			}
			else if (opt > 6 || opt < 1) System.out.println("wrong input");
			else {
				switch(opt) {
					case 1 -> addStudent();
					case 2 -> addTeacher();
					case 3 -> {
						System.out.println("enter name: ");
						int index = rsearchByName(in.nextLine());
						if (index == -1) System.out.println("Not found");
						else {
							System.out.println("found");
							System.out.println(humans[index].toString());
						}
					}
					case 4 -> {
						System.out.println("enter name: ");
						int index = rsearchByName(in.nextLine());
						if (index == -1) System.out.println("Not found");
						else {
							System.out.println("found, enter new info:" + "\n");
							System.out.println("name: ");
							humans[index].setName(in.nextLine());
							System.out.print("Age\t\t: ");
							humans[index].setAge(in.nextInt());
							System.out.print("Nationality\t: ");
							humans[index].setNationality(in.next());
							System.out.print("Salary\t\t: ");
							humans[index].setSalary(in.nextDouble());
							System.out.print("School Name\t: ");
							humans[index].setSchoolName(in.next());
							System.out.println(humans[index].toString());
						}
					}
				}	
			}
			System.out.println("------------");
		}
	}
}
