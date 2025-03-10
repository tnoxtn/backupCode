package Assignment2;

import java.util.Scanner;

class Complex_{
	int real;
	int imag;
	
	void setData() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter The Real Number: ");
		real = in.nextInt();
		System.out.print("Enter The Imaginary Number: ");
		imag = in.nextInt();
	}
	
	void display() {
		System.out.println(real+ " + " +imag+"i");
	}
	
	public Complex_ add (Complex_ obj) {
		Complex_ c = new Complex_();
		c.real= obj.real+ real;
		c.imag= obj.imag+ imag;
		return c;
	}
}
public class Q2_ {

	public static void main(String[] args) {
		Complex_ one = new Complex_();
		Complex_ two = new Complex_();
		Complex_ three = new Complex_();
		one.setData();
		two.setData();
		three=one.add(two);
		
		System.out.println("First Complex Number: ");
		one.display();
		System.out.println("Second Complex Number: ");
		two.display();
		System.out.println("Final Sum of Complex Number: ");
		three.display();
	}

}

//Enter The Real Number: 5
//Enter The Imaginary Number: 6
//Enter The Real Number: 4
//Enter The Imaginary Number: 5
//First Complex Number: 
//5 + 6i
//Second Complex Number: 
//4 + 5i
//Final Sum of Complex Number: 
//9 + 11i
