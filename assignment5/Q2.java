/* Q2. WAP to check whether a number is twisted prime or not. Twisted prime is a number if the 
number and its reverse both are prime then it is called twisted prime.*/
package assignment5;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter The Number: ");
        int num = in.nextInt();
        boolean prime = true;
        //prime check
        for (int i = 2; i<= Math.sqrt(num); i++) {
        	if ( num % i == 0) {
        		prime = false;
        		break;
        	}
        }
        
        //reverse
        int revNum = 0;
        int temp = num;
        
        while(temp!=0) {
        	int digit = temp % 10;
        	revNum = revNum * 10 + digit;
        	temp = temp/10;
        }
        
        // reverse prime check
        boolean primeRev = true;
        for (int i = 2; i<= Math.sqrt(revNum); i++) {
        	if ( revNum % i == 0) {
        		primeRev = false;
        		break;
        	}
        }
        
 
 if (primeRev && prime) {
	 System.out.println("it is a twisted prime");
 }
 else if (num !=0 || revNum != 0) {
	 System.out.println("it is not a twisted prime");
 }
 
	}

}
//Enter The Number: 43
//it is not a twisted prime
