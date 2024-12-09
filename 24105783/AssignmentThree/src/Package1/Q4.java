package Package1;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number from 1-9: ");
		int usr = input.nextInt();
		
		if (usr>9 || usr<1) {
			System.out.println("invalid input");
			return;
		}
		
		int rdm = (int) ((Math.random()*9) + 1);
//		(Math.random()*10), 0 - 9.9 , but we dont want 0, so this is wrong
		System.out.println("Computer Guesses: " + rdm);
		
		if (usr==rdm) {
			System.out.println("You Got It Right");
		}
		else if (rdm==usr+1 || rdm==usr-1) {
			System.out.println("You Almost Got It");
		}
		else {
			System.out.println("You Got it Wrong");
		}
		

	}

}

//op
//Enter any number from 1-9: 2
//Computer Guesses: 1
//You Almost Got It