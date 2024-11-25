package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q4) to add the digits on any number between 0 to 1000*/

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number Between 0 and 1000: ");
		int num = input.nextInt();
		
		int n1 = num % 10;
		int n2 = (num / 10) % 10;
		int n3 = (num / 100) % 10;
		
		int add = n1 + n2 + n3;
		
		
	System.out.println("The Sum of the Digits is " + add);

	}

}

//output
/*
Enter any Number Between 0 and 1000: 999
The Sum of the Digits is 27
*/