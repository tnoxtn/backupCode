//Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in
//the sequence are generated from the sum of their three most recent predecessors. Write a java
//program to generate this sequence up to n terms where n > 3.

package package1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the Value of n: ");
        int n = in.nextInt();
        
        if (n<3) {
        	System.out.println("enter a greater value");
        }
        else {
        	int a= 0; int b = 1; int c = 1; 
        	System.out.print("sequence is : 0,1,1");
        	for(int i=4; i<=n; i++) {
        		int sum = a + b + c;
        		System.out.print("," + sum);
        		a=b;
        		b=c;
        		c=sum;
        	}
        }

	}

}
//Enter the Value of n: 10
//sequence is : 0,1,1,2,4,7,13,24,44,81