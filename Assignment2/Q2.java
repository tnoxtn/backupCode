package Assignment2;
import java.util.*;

class Complex{
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
	
	public Complex add (Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.real = c1.real+c2.real;
		c3.imag = c2.imag+c2.imag;
		return c3;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		Complex one = new Complex();
		Complex two = new Complex();
		Complex three = new Complex();
		one.setData();
		two.setData();
		three=three.add(one,two);
		
		System.out.println("First Complex Number: ");
		one.display();
		System.out.println("Second Complex Number: ");
		two.display();
		System.out.println("Final Sum of Complex Number: ");
		three.display();

	}

}
