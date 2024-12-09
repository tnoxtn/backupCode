package Package1;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Any Year: ");
	int year = input.nextInt();

		
	if (year%400==0 || year%4==0) {
		System.out.println("True");
	}
	else if (year%400!=0)  {
		System.out.println("False");
	}
	else {
		System.out.println("False");
	}
	
	}

}

//op
//Enter Any Year: 2024
//True