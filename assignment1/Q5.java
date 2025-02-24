package assignment1;
import java.util.*;
public class Q5 {
	public static int sumOfDigits(int n) {
		int sum = 0; int sumx=0; 
		int temp = n;
		
		while(temp!=0) {
			int digit = temp%10;
			sum = sum + digit;
			temp = temp / 10;
		}
		while(sum>10) {
		while(sum!=0) {
		int digitx = sum%10;
		sumx = sumx + digitx;
		sum = sum / 10;
		}}
		return sumx;
	}


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	System.out.print("Enter the number: ");
			int num = in.nextInt();
			
			
	System.out.println("sum of digit " + num + " until it is a single digit is " + sumOfDigits(num));
		}

	}

	//output:
	//Enter the number: 9294
	//sum of digit 9294 until it is a single digit is 6