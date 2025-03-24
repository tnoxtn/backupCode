package package1;
import java.util.Scanner;
class Book{
	int bookId;
	double price;
	int quantity;
	static double totalAmount;
	
	Book(int bookId, double price, int quantity){
		this.bookId=bookId;
		this.price=price;
		this.quantity=quantity;
//		totalAmount = totalAmount + (price*quantity);
	}
	
	public void totalAmount() {
		totalAmount = totalAmount + (price*quantity);
	}
	
	void dispayData() {
		System.out.println("Book ID: "+bookId);
		System.out.println("Book Quantity: "+quantity);
		System.out.println("Price: "+price);
	}
}
public class q3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Book b[]= new Book[2];
		for(int i=0; i<2; i++) {
			System.out.print("Enter Book ID: ");
			int id = in.nextInt();
			System.out.print("Enter the Price: ");
			double p = in.nextDouble();
			System.out.print("Enter the quantity: ");
			int q = in.nextInt();
			
			b[i]= new Book(id,p,q);
			b[i].totalAmount();
		}
		
		for(int i=0; i<2; i++) {
			System.out.println("Details pf product: "+ (i+1));
			b[i].dispayData();
			
		}
		
		System.out.println("Total bill: "+ Book.totalAmount);
		

	}

}

//Enter Book ID: 666
//Enter the Price: 2030
//Enter the quantity: 1
//Enter Book ID: 345
//Enter the Price: 200
//Enter the quantity: 2
//Details pf product: 1
//Book ID: 666
//Book Quantity: 1
//Price: 2030.0
//Details pf product: 2
//Book ID: 345
//Book Quantity: 2
//Price: 200.0
//Total bill: 2430.0

