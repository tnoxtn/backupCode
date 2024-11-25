package Package1;

import java.util.Scanner;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q2) to find meter, feet, inch, cm*/

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance in KM: ");
		
		double d = input.nextDouble();
		
		double m = d*1000;
		double f = d*3280.8399;
		double i = d*6496062.9854;
		double c = d*100000;
		
		System.out.println("Distance im meter: " + m + " meter");
		System.out.println("Distance im feet: " + f + " feet");
		System.out.println("Distance im inch: " + i + " inch");
		System.out.println("Distance im centimeters: " + c + " centimeter");
	}

}

//output-
/*
Enter the distance in KM: 165
Distance im meter: 165000.0 meter
Distance im feet: 541338.5835 feet
Distance im inch: 1.071850392591E9 inch
Distance im centimeters: 1.65E7 centimeter
*/