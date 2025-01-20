package assignment6;

public class Q5 {
 public static double area(int n, double side) {
	 return (n * side * side)/(4 * Math.tan(Math.PI/n));
 }
	public static void main(String[] args) {
		int n = 4;
		int side =4;
		System.out.println(area(n, side));

	}

}

//output
//32.69441376024124
