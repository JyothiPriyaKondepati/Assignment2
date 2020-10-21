import java.util.*;
public class Mainapplication {
	private static Scanner sc = new Scanner(System.in);
	private static Studenttt student;
	public static void main(String[] args) {
		System.out.println(" enter name y/n");
		String isName = sc.next();
		System.out.println("enter id y/n");
		String isId = sc.next();
		System.out.println("enter grade y/n");
		String isgrade = sc.next();
		if (isName.equalsIgnoreCase("y") && isId.equalsIgnoreCase("y") && isgrade.equalsIgnoreCase("y")) {
			System.out.println("Enter your name, id and grade values");
			String name = sc.next();
			String id = sc.next();
			int  grade = sc.nextInt();
			student = new Studenttt(name, id, grade);
			displayDetails();
		} 
		else if (isName.equalsIgnoreCase("y") && isId.equalsIgnoreCase("y") && !isgrade.equalsIgnoreCase("y")) {
			System.out.println("Enter your name, id values");
			String name = sc.next();
			String id = sc.next();
			student = new Studenttt(name, id);
			displayDetails();
		}
		else if (!isName.equalsIgnoreCase("y") && isId.equalsIgnoreCase("y") && !isgrade.equalsIgnoreCase("y")) {
			System.out.println("Enter your id value");
			String id = sc.next();
			student = new Studenttt(id);
			displayDetails();
		} 
		else {
			System.out.println("you have to  select name or id");
		}
	}
	public static void displayDetails() {
		System.out.println("enter year y/n");
		String isYear = sc.next();
		if (isYear.equalsIgnoreCase("y")) {
			System.out.println("Enter year");
			int year = sc.nextInt();
			student.display(year);
		} else {
			student.display();
		}
	}
}

	
