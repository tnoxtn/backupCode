package Package1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water (ml): ");
		int water = input.nextInt();
		
		if (water >= 5000) {
			System.out.println("Yes, Alice is following doctor\'s advice");
		}
		else {
			System.out.println("No, Alice is following doctor\'s advice");
		}

	}

}

//op
//Enter the amount of water (ml): 6000
//Yes, Alice is following doctor's advice