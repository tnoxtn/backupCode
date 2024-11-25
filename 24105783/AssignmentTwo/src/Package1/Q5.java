package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q5) to find the surface area and volume of hemisphere*/

import java.util.Scanner;
import java.lang.Math;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Radius of hemisphere: ");
		double rad = input.nextDouble();
		double sa = 3 * Math.PI * Math.pow(rad, 2);
		double vol = (2.0/3) * Math.PI * Math.pow(rad, 3);
        //rad * rad * rad is same as  Math.pow(rad, 3)
		
		System.out.println("the surface area of hemisphere is " + sa);
		System.out.println("the volume of hemisphere is " + vol);

	}

}

//output
/*
Enter the Radius of hemisphere: 15
the surface area of hemisphere is 2120.5750411731105
the volume of hemisphere is 7068.583470577034
*/