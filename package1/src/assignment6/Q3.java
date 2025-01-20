package assignment6;
import java.util.Scanner;
public class Q3 {

	public static int reverse(int number) {
		int temp = number;
		int rev = 0;
		
		while(temp!=0) {
			rev = rev*10 + temp%10;
			temp /= 10;
		}
		return rev;
	}
	
	public static boolean isPalindrome (int number) {
		return (number == reverse(number));
	}
	

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		if (isPalindrome(num)) {
			System.out.println("it is a palindrom");
		}
		else {
			System.out.println("it is not a palindrom");

		}

	}

}

//Enter a number: 
//1221
//it is a palindrom
