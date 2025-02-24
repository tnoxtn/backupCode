package assignment1;
import java.util.*;
public class Q6 {
	public static boolean isOdd (int n) {
//		if((n & 1) == 1) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		while(n>1) {
			n = n-2;
		}
		if(n==0){
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
System.out.print("Enter the number: ");
		int num = in.nextInt();
		
		System.out.println(num + " is odd: " + isOdd(num));

	}

}

//output
//Enter the number: 37
//37 is odd: true

//Enter the number: 24
//24 is odd: false