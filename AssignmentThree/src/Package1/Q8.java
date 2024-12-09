package Package1;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X-Cordinates: ");
		double x = input.nextDouble();
		System.out.print("Enter Y-Cordinates: ");
		double y = input.nextDouble();

		if ( x>0 & y>0) {
			System.out.println("it is in 1st quadrant");
		}
		else if ( x>0 & y<0) {
			System.out.println("it is in 2st quadrant");
		}
		else if ( x<0 & y>0) {
			System.out.println("it is in 3st quadrant");
		}
		else if ( x<0 & y<0) {
			System.out.println("it is in 1st quadrant");
		}
		else if (y == 0 & x==0 ) {
			System.out.println("it is in origin");
		}
		else {
			System.out.println("invalid");
		}
	
	
	
		if (x<=0 & y!=0) {
			System.out.println(x + " " + y + " is in y axis");
		}
		else if (y<= 0 & x!=0 ){
			System.out.println(x + " " + y + " is in x axis");
		}
		else if (y == 0 & x==0 ) {
			System.out.println(x + " " + y + " is in origin");
		}
		else {
			System.out.println("invalid");
		}
		
		

}
}
