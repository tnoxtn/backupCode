package assignment1;
import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Weight (mass) in kilogram: ");
		double w = in.nextDouble();
		System.out.print("Height in meters: ");
		double h = in.nextDouble();
		
		double bmi = w/(h*h);
		
		if(bmi<18.5) {
			System.out.println("The person is Underweight");
		}
		else if(bmi>18.5 && bmi<24.9){
			System.out.println("The person is Normal Weight");
		}
		else if(bmi>25.0 && bmi<29.9){
			System.out.println("The person is Overweight");
		}
		else if(bmi>30.0){
			System.out.println("The person is Obese");
		}
		
	}

}

//output:
//Weight (mass) in kilogram: 68
//Height in meters: 2
//The person is Underweight

//Weight (mass) in kilogram: 96
//Height in meters: 1.4
//The person is Obese