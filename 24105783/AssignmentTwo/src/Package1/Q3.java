package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q3) to find da, hra, gross*/

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Basic Salary: ");
		double bas = input.nextDouble();

		double da = (40.0 / 100) * bas;
		double hra = (20.0 / 100) * bas;
		double grs = bas + da + hra;
		
		System.out.println("DA is " + da);
		System.out.println("HRA is " + hra);
		System.out.println("Gross Salary is " + grs);
		

	}

}

//output:
/*
Enter the Basic Salary: 69594.20
DA is 27837.68
HRA is 20878.26
Gross Salary is 118310.14
*/