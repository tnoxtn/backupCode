/* Q4. WAP to calculate and display the factorial of all numbers between m and n (where m < n, m 
> 0, n > 0)*/
package assignment5;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the value of m: ");
        int m = in.nextInt();
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        if (m<=0 || n<=0 || m>n) {
        	System.out.println("Invalid input");
        }
        else {
        	for( int i = m; i<=n; i++) {
        		int fact = 1;
        		for(int j = 1; j<=i; j++) {
        			fact = fact*j;
        		}
        		
        		System.out.println("factorial is " + fact);
        	}
        }
	}

}
//output
//Enter the value of m: 2
//Enter the value of n: 5
//factorial is 2
//factorial is 6
//factorial is 24
//factorial is 120