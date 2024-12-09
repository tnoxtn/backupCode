package Package1;
import java.util.Scanner;
public class H1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Here (0 for Scissor, 1 for Rock, (2 for paper): ");
		int usr = input.nextInt();
		
		
		switch(usr) {
		case 0:
			System.out.println("You are Scissors");
			break;
		
		case 1:
			System.out.println("You are Rock");
			break;
		case 2:
			System.out.println("You ar Paper");
			break;
		}
		
		
		int rdm = (int) ((Math.random()*3));
		switch(rdm) {
		case 0:
			System.out.println("Computer is Scissors");
			break;
		case 1:
			System.out.println("Computer is Rock");
			break;
		case 2:
			System.out.println("Computer is Paper");
			break;
		}
		
		
		
		
		
		
		
//		if (usr == rdm) {
//			System.out.println("its a draw");
//		}
//		else if (usr>rdm) {
//			System.out.println("user wins");
//		}
//		else {
//			System.out.println("computer wins");
//		}
	}

}

