package Package1;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        // Prompt for units consumed
        System.out.print("Enter the Units: ");
        double units = input.nextDouble();
        double bill = 0;

        // Calculate electricity bill based on unit ranges
        if (units <= 50) {
            bill = units * 3;
        } else if (units > 50 && units <= 200) {
            bill = (50 * 3) + ((units - 50) * 4.80);
        } else if (units > 200 && units <= 400) {
            bill = (50 * 3) + (150 * 4.80) + ((units - 200) * 5.80);
        } else {
            bill = (50 * 3) + (150 * 4.80) + (200 * 5.80) + ((units - 400) * 6.20);
        }

        // Display the electricity bill
        System.out.printf("Electricity Bill is: Rs. %.2f\n", bill);

        // Ask if the user wants to pay online
        System.out.print("Do you want to pay online (y/n): ");
        char choice = input.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            // Apply 3% discount for online payment
            double discount = bill * 0.03;
            double amountPayable = bill - discount;
            
            // Display the total amount, discount, and payable amount
            System.out.printf("Total amount: Rs. %.2f\n", bill);
            System.out.printf("Discount: Rs. %.3f\n", discount);
            System.out.printf("Amount payable: Rs. %.3f\n", amountPayable);
        } else if (choice == 'n' || choice == 'N') {
            // Display payable amount without discount
            System.out.printf("Amount payable: Rs. %.2f\n", bill);
        } else {
            // Invalid input
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }


		//output- 
// 		Enter the Units: 867
// Electricity Bill is: Rs. 4925.40
// Do you want to pay online (y/n): y
// Total amount: Rs. 4925.40
// Discount: Rs. 147.762
// Amount payable: Rs. 4777.638








		
		/*
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
*/
	}

}
