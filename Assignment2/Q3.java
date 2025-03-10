package Assignment2;
import java.util.*;
class Book{
	int bookId;
	double price;
	int quantity;
	static double totalAmount;
	
	Book(int bookId, double price, int quantity){
		this.bookId=bookId;
		this.price=price;
		this.quantity=quantity;
		calculate();
	}
	void dispalyDetails() {
		System.out.println("Book ID: "+bookId);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
	void calculate() {
		totalAmount = totalAmount + (price*quantity);
	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Book arr[] = new Book[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter the Book-ID: ");
			int id= in.nextInt();
			System.out.print("Enter The Price: ");
			double p = in.nextDouble();
			System.out.print("Enter the Quantity: ");
			int q= in.nextInt();
			arr[i]=new Book(id,p,q);
			}
		
		for(int i = 0; i < 5; i++) {
			arr[i].dispalyDetails();
		}
		System.out.println("Total Amount: "+ Book.totalAmount);
		
		
		
		

	}

}

//Enter the Book-ID: 234
//Enter The Price: 300
//Enter the Quantity: 5
//Enter the Book-ID: 333
//Enter The Price: 400
//Enter the Quantity: 3
//Enter the Book-ID: 344
//Enter The Price: 333
//Enter the Quantity: 4
//Enter the Book-ID: 3333
//Enter The Price: 44
//Enter the Quantity: 33
//Enter the Book-ID: 444
//Enter The Price: 3333
//Enter the Quantity: 44
//Book ID: 234
//Price: 300.0
//Quantity: 5
//Book ID: 333
//Price: 400.0
//Quantity: 3
//Book ID: 344
//Price: 333.0
//Quantity: 4
//Book ID: 3333
//Price: 44.0
//Quantity: 33
//Book ID: 444
//Price: 3333.0
//Quantity: 44
//Total Amount: 152136.0

