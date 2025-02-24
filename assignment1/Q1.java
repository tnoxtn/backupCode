package assignment1;
import java.util.*;
public class Q1 {

	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("The positive integer greater than 2: ");
		int num = in.nextInt();
		
		if(num<2) {
			System.out.println("invalid input");
			return;
		}// else is not required.
		
		int cnt=0;
		while(num>2) {
			num = num/2;
			cnt++;
		}

		System.out.println("The Number of times one must repeatedly divide by 2 is " + cnt);
	}

}

//output:
//The positive integer greater than 2: 67
//The Number of times one must repeatedly divide by 2 is 5
