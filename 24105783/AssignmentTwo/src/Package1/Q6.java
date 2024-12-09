package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q6)

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		double t = input.nextDouble();
		double g =  32.174;
		double d = (1.0/2) * g * t * t;
		System.out.println("distance travelled is " + d + " feet");
	}

}

//output:
/*
Enter the number of seconds: 5
distance travelled is 402.175 feet
*/