package Package2;
/* Write a java program that takes three int values from the command line and prints them in 
ascending order. Use Math.min() and Math.max(). */
public class Q5 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int xy = (int) (Math.max(a,  b));
		int x = (int) (Math.max(xy,  c));
		int yx = (int) (Math.min(a,  c));
		int y = (int) (Math.min(yx,  b));
		int m = ((a+b+c) - (x + y));
		System.out.println("output is " + y + " " +m + " " +x);

	}

}
