package assignment4;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the Base: ");
		int base = in.nextInt();
		System.out.print("Enter the Power: ");
		int power = in.nextInt();
		int ans =1;
		
		for ( int i=1; i<= power; i++) {
			ans = ans*base;
		}
		
		System.out.println(base + " power " + power + " is " + ans);
		
	}

}

//output
//Enter the Base: 5
//Enter the Power: 4
//5 power 4 is 625