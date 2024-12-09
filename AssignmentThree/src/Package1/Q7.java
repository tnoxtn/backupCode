package Package1;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Units: ");
	double unt = input.nextDouble();
	double bill = 0;
	if (unt<= 50) {
		bill = unt*3;
	}
	else if (unt>=50 && unt<=200) {
		bill = (50*3) + ((unt-50) * 4.80);
	}
	else if (unt>=200 && unt<=400) {
		bill = (50*3) + (150 * 4.80) + ((unt-200) *5.8);
	}
	else {
		bill = (50*3) + (150 * 4.80) + (200 *480) + ((unt-400) * 6.20);
	}
	
//	System.out.println("Electricity Bill is "+ bill);
	System.out.printf("Electricity Bill is %.2f\n", bill); // for up to 2 decimal place
//	System.out.printf("Electricity Bill is %.4f", bill); // must use \n for new line
	
	System.out.println("DO YOU WANNA PAY ONLINE? (y/n)");
	char x = input.next().charAt(0);
int y = (int) x;
	if (y == 121) {
		double dis = bill*(3/100.0);
		double newBill = (bill - dis);
		System.out.println("amount payble: " + newBill);
		
	}
	else if (y == 110)
	{
		System.out.println("amount payble: RS" + bill);
	}
	else {
		System.out.println("invalid");
	}
	
//	System.out.println((int)x);
	
//	op - 
//	Enter the Units: 234
//	Electricity Bill is 1067.20
//	DO YOU WANNA PAY ONLINE? (y/n)
//	y
//	amount payble: 1035.184

	}

}