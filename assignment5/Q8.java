//WAP to enter the value of n and display find the following sum of the series:
//1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)

package package1;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the Value of n: ");
        int n = in.nextInt();
        int sumx = 0;
	for (int i = 1; i<= n; i++) {
		int sum=0;
		for (int j = 1; j<= i; j++) {
			sum += j;
		}
		sumx += sum;
	}
	System.out.println("sum of the series is: " + sumx);
		}

}

//Enter the Value of n: 4
//sum of the series is: 20
//
