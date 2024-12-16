package assignment4;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Number: ");
        int a = in.nextInt();
		int b = 10;
		
		System.out.println("Multiplication Table of " + a + " is ");
		int i;
		
		for (i = 1; i<= 10 ; i++) {
			
				System.out.println(a + "*" + i + "=" + (a*i) );
			
		}
	}

}

//output
//Enter Number: 6
//Multiplication Table of 6 is 
//6*1=6
//6*2=12
//6*3=18
//6*4=24
//6*5=30
//6*6=36
//6*7=42
//6*8=48
//6*9=54
//6*10=60