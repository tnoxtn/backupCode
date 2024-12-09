package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q1) to convet faheremheit to celcius*/

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double f;
		System.out.print("Enter a temprature in faherenheit: ");
		f = input.nextDouble();
		
		double c;
		c = (f-32)*(5.0/9);
		
		System.out.println("Temprature in celcius is " + c);
	}

}

//OUTPUT-
/*
Enter a temprature in faherenheit: 97
Temprature in celcius is 36.111111111111114
*/