package assignment4;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter a number: ");
		int num = in.nextInt();
		int sum = 0;
		
		for (int i =1; i<=num/2; i++) {
			if(num%i==0) {
				sum = sum + i;
//				System.out.print(sum + " ");
			}
		}
		if (sum==num){
		System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}

}

//output
//enter a number: 28
//28 is a perfect number