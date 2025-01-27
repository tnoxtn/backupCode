package assignment7;
import java.util.Scanner;
public class Q4 {
	
	public static double min (double[] array) {
		double min = array[0];
		for(int i = 1; i<array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 10 Elements: ");
		double arr[] = new double [10];
		for(int x=0; x<arr.length; x++) {
			arr[x] = in.nextDouble();
		}
		
		System.out.println("the minimum element is: " + min(arr));
		

}
}

//Enter 10 Elements: 4.0 3.5 3.7 5.8 5.6 2.7 8.9 0.5 4.6 9.9
//the minimum element is: 0.5