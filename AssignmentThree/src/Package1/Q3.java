package Package1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input First Number: ");
		int a = input.nextInt();
		System.out.print("Input Second Number: ");
		int b = input.nextInt();
		System.out.print("Input Third Number: ");
		int c = input.nextInt();
		
		if (c>b && b>a){
			System.out.println("Increasing");
		}
		else if (a>b && b>c) {
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Neither Increasing Nor Decreasing");
		
		}
		

	}

}

//op
//Input First Number: 700
//Input Second Number: 500
//Input Third Number: 300
//Decreasing