/* Q1. Amicable numbers are pair of numbers each of whose divisors are added to give the other 
number. 
Example: The smallest pair of amicable numbers is (220, 284). 
They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 
110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which 
the sum is 220. 
Note: 1 is included as a divisor but the numbers are not included as their own divisors. 
Write a java program that tests whether a given pair of numbers is amicable numbers or not */
package assignment5;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 1st Num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Num: ");
        int num2 = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        
//        for( int i =1; i<= Math.max(NUM1,  NUM2)/2; i++)
        {
//        if (num1 % i == 0) {
//    		sum1 = sum1 + i;
        
//        if (num2 % i == 0) {
//    		sum2 = sum2 + i;
//        }
        	
        for( int i =1; i<= num1/2; i++) {
        	if (num1 % i == 0) {
        		sum1 = sum1 + i;
        	}
        }
        
        for( int i =1; i<= num2/2; i++) {
        	if (num2 % i == 0) {
        		sum2 = sum2 + i;
        	}
        }
	
        if ( sum1 == num2 && sum2 == num1) {
        	System.out.println(num1 + " and " + num2 +" are amicable");
        }
        else {
        	System.out.println(num1 + " and " + num2 +" are not amicable");
        }
    	
    }
	}}
//out
//Enter 1st Num: 220
//Enter 2nd Num: 284
//220 and 284 are amicable
