package Package1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible to cast your vote");
		}
//		else {
//			System.out.println("You are not eligible to cast your vote");
//		}

	}

}

//op
//Enter your age: 30
//You are eligible to cast your vote