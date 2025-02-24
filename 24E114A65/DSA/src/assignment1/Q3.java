package assignment1;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number (check for spy number):  ");
		int num = in.nextInt();
		int sum = 0, prod = 1;
		int temp= num;
		
		while(temp!=0) {
			int digit = temp%10;
			sum = sum + digit;
			prod = prod * digit;
			temp = temp / 10;
		}
		
		if(sum==prod) {
			System.out.println(num + " is a spy number");
		}
		else {
			System.out.println(num + " is not a spy number");

		}
		
	}

}

//output:
//Enter any number (check for spy number):  132
//132 is a spy number

//Enter any number (check for spy number):  1124
//1124 is a spy number

//Enter any number (check for spy number):  333
//333 is not a spy number