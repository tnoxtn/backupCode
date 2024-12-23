/* Q3. WAP to enter the first number and second number. Display the prime numbers between the 
first and second number.*/
package assignment5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();
        
        System.out.print("Prime number is ");
        for (int i = num1; i<= num2; i++) {
        	boolean prime = true;
        	{
        		for(int j = 2; j<=Math.sqrt(i); j++) 
        		{
        			if (i%j== 0) 
        			{
                		prime = false;
                		break;
        		}
        	}
        		if(prime) {
        			System.out.print(i + " ");
        		}
        		}
        	
	}

}}

//out-
//Enter 1st Number: 5
//Enter 2nd Number: 15
//Prime number is 5 7 11 13 