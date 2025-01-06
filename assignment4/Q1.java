package assignment4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner (System.in);
		System.out.print("enter 1st number: ");
		int a = inp.nextInt();
		System.out.print("enter 2nd number: ");
		int b = inp.nextInt();
		System.out.print("enter 3rd number: ");
		int c = inp.nextInt();
		
		System.out.println("Numbers displayed:");
		
		for(int i = a; i<=b; i = i+c) {
			System.out.println(i + " ");
			sum += i;
		}
		 System.out.println(); // Move to the next line
        System.out.println("The sum of numbers displayed is " + sum); // Print the sum
	}

}
