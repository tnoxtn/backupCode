//Write a program that will read the value of n from the user and calculate sum of the following series:
package package1;

import java.util.Scanner;

public class Q9 {


		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			System.out.print("Enter the Value of n: ");
	        int n = in.nextInt();
	        double sum = 0.0;
		for (int i = 1; i<= n; i++) {
			sum += 1.0 / (i*i);
			
		}
		System.out.println("sum is: " + sum);
			

	}

}
