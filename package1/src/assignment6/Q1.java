package assignment6;

public class Q1 {

	public static int additionSimple(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return x-y;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisonSimple(int x, int y) {
		return x/y;
	}
	public static int reminderSimple(int x, int y) {
		return (x%y);
	}
	public static double squarerootSimple(int n) {
		return Math.sqrt(n);
	}
	
	
	public static void main(String[] args) {
	System.out.println(additionSimple(10, 20));
	System.out.println(subtractionSimple(30, 20));
	System.out.println(multiplicationSimple(10, 20));
	System.out.println(divisonSimple(80, 20));
	System.out.println(reminderSimple(10, 20));
	System.out.println(squarerootSimple(100));
	}

}

//output:
//30
//10
//200
//4.0
//10
//10.0