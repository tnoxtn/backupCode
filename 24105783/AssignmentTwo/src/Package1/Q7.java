package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment 2, Q7): to display the table

import java.lang.Math;

public class Q7 {

	public static void main(String[] args) {
		int a = 1, b = 2;
		int p1, p2, p3, p4, p5;
		System.out.println("a\tb\tpow(a, b)");
		
		p1 = (int) Math.pow(a, b);
		System.out.println(a+"\t"+b+"\t"+p1);
		a++;
		b++;
		p2 = (int) Math.pow(a, b);
		System.out.println(a+"\t"+b+"\t"+p2);
		a++;
		b++;
		p3 = (int) Math.pow(a, b);
		System.out.println(a+"\t"+b+"\t"+p3);
		a++;
		b++;
		p4 = (int) Math.pow(a, b);
		System.out.println(a+"\t"+b+"\t"+p4);
		a++;
		b++;
		p5 = (int) Math.pow(a, b);
		System.out.println(a+"\t"+b+"\t"+p5);
		a++;
		b++;
	}

}

//output
/*
a	b	pow(a, b)
1	2	1
2	3	8
3	4	81
4	5	1024
5	6	15625
*/