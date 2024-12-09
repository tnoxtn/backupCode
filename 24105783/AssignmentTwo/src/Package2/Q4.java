package Package2;
/*Write a java program that takes a double value t from the command line and prints the value 
of cos (5t) + sin (7t). Use Math.cos() and math.sin() */
public class Q4 {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double sin = Math.sin(5*t);
		double cos = Math.sin(5*t);
		double sum = (sin + cos);
		System.out.println("sum is "+ sum);
	}

}
//math radian...