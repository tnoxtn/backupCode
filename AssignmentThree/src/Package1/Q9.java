package Package1;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number: ");
		int a = input.nextInt();
		
		System.out.print("Enter the 2nd Number: ");
		int b = input.nextInt();
		
		System.out.print("Enter the 3rd Number: ");
		int c = input.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a +" is largest");
		}
		else if (b>a && b>c) {
			System.out.println(b +" is largest");
		}
		else {
			System.out.println(c +" is largest");
		}
		
		
		if (a>b && a<c) {
			System.out.println("2nd largest number: " + a);
		}
		else if (b>a && b<c) {
		System.out.println("2nd largest number: " + b);
		}
		else if (c>a && c<b) {
			System.out.println("2nd largest number: " + c);
		}
		else if (a>c && a<b) {
			System.out.println("2nd largest number: " + a);
		}
		else if (b>c && b<a) {
			System.out.println("2nd largest number: " + b);
		}
		else {
			System.out.println("2nd largest number: " + c);
		}
	}

}
