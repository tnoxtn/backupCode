package assignment4;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 1st Number: ");
		int x = in.nextInt();
		System.out.print("Enter 2nd Number: ");
		int y = in.nextInt();
		int temp = 0;
		int ans = x % y;
		if (x==y) {
			System.out.println("GCD of x and y is" + y);
		}
		else {
			while(y!=0) {
				temp = y;
				y = x % y;
				x = temp;
			}
		}
		System.out.println("GCD of x and y is " + x);
		

	}

}

//output
//Enter 1st Number: 98
//Enter 2nd Number: 56
//GCD of x and y is 14
