package assignment3;
import java.util.Scanner;
public class A3Q07 {
	public static int fact (int n) {
		int ans =1;
		if(n==0) {
			return 1;
		}
		return (n * fact(n-1));
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a Integer: ");
		int x = in.nextInt();
		System.out.println("Factorial of "+x+" is: "+fact(x));
	}

}
