package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 1, Q7) to exchange variables*/

public class Q7 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println("before swap " + "a=" + a + " b=" + b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swap " + "a=" + a + " b=" + b);
		
	}

}

//OP:
//before swap a=10 b=5
//after swap a=5 b=10
