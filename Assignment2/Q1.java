package Assignment2;
import java.util.*;
class Car{
		String model;
		int year;
		
		void setDetails() {
			Scanner in = new Scanner (System.in);
			System.out.print("Enter The Model: ");
			model = in.next();
			System.out.print("Enter The Year: ");
			year = in.nextInt();
		}
		
		void displayDetails() {
			System.out.println("Model: " + model);
			System.out.println("Year: " + year);

		}
}
public class Q1 {

	public static void main(String[] args) {
		
		Car one = new Car();
		one.model="Toyota"; 
		one.year=2020;
		
		Car two = new Car();
		two.setDetails();
		
		one.displayDetails();
		two.displayDetails();

		if(one.year>two.year) {
			System.out.println("Car one is newer");
		}
		else {
			System.out.println("Car two is newer");
		}
	}

}

//Enter The Model: vokswagon
//Enter The Year: 2022
//Model: Toyota
//Year: 2020
//Model: vokswagon
//Year: 2022
//Car two is newer
