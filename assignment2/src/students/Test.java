package students;

import java.util.Scanner;

public class Test extends Student {

	
	public int mark1, mark2;
	public void inputDetails() {
		super.inputDetails();
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Mark 1: ");
		mark1 = in.nextInt();
		System.out.print("Enter Mark 2: ");
		mark2 = in.nextInt();
	}
	
	public void showDetails() {
		System.out.println("Details: ");
		System.out.println("Mark1: "+mark1);
		System.out.println("Mark2: "+mark2);

	}
	
	}