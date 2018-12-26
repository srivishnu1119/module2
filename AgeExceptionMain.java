package assignments;

import java.util.Scanner;

public class AgeExceptionMain {
	
	public static void main(String[] args) {
		
			AgeException2 a=new AgeException2();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Name");
			String name=scan.nextLine();
			System.out.println("Enter age");
			int age=scan.nextInt();
			a.Person(name, age);

}
}
