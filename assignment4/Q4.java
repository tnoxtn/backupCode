package assignment4;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the first number: ");
        int x = inp.nextInt();
        System.out.print("Enter the second number: ");
        int y = inp.nextInt();

        // Implementing Euclid's algorithm in steps
        while (y != 0) {  // Check if y divides x
            int remainder = x % y;  // Compute the remainder
            x = y;                  // Update x
            y = remainder;          // Update y
        }

        // When the loop exits, y is the GCD
        System.out.println("GCD of the given numbers is " + y);
    }
}



// import java.util.Scanner;
// public class Q4 {

// 	public static void main(String[] args) {
// 		Scanner in = new Scanner (System.in);
// 		System.out.print("Enter 1st Number: ");
// 		int x = in.nextInt();
// 		System.out.print("Enter 2nd Number: ");
// 		int y = in.nextInt();
// 		int temp = 0;
// 		int ans = x % y;
// 		if (x==y) {
// 			System.out.println("GCD of x and y is" + y);
// 		}
// 		else {
// 			while(y!=0) {
// 				temp = y;
// 				y = x % y;
// 				x = temp;
// 			}
// 		}
// 		System.out.println("GCD of x and y is " + x);
		

// 	}

// }

//output
//Enter 1st Number: 98
//Enter 2nd Number: 56
//GCD of x and y is 14
