//Q5.WAP to display the multiplication table from 2 to 15
package assignment5;

public class Q5 {
	public static void main(String[] args) {


    int a = 2;

    int b = 15;
    
    
    System.out.println("Multiplication Table of " + a + " " + b + " is:");
   
    
    for(int i=a; i<= b; i++) {
    	for (int j= 1; j<=10; j++) {
    		System.out.println(i + "*" + j + " = " + (i*j));
    	}
    	System.out.println();
    }
    
    
	}
}

//output
//Enter First Number: 2
//Enter Last Number: 4
//Multiplication Table of 2 4 is:
//....