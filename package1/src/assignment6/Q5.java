package assignment6;
import java.util.Scanner;
public class Q5 {
 public static double area(int n, double side) {
	 return (n * side * side)/(4 * Math.tan(Math.PI/n));
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of sides:");
			int n = sc.nextInt();
			System.out.println("Enter length of sides:");
			double side = sc.nextDouble();
			System.out.println(area(n, side));

	}

}

//output
//32.69441376024124
