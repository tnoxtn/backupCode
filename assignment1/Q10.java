package assignment1;
import java.util.*;

public class Q10 {

	public static double sumColumn (double[][] m, int columnIndex) {
		double sum = 0;
		for(int i = 0; i<m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double [][] arr = new double[3][4];
		System.out.println("Enter the Elements of 2D Array of 3x4: ");
		for(int i = 0; i<arr.length; i++) {        // arr.length for rows
			for(int j = 0; j<arr[i].length; j++) { // arr[i].length for columns
				arr[i][j] = in.nextDouble();
			}
		}
		
		for(int i = 0; i<4; i++) {
			System.out.println("Sum of Elements are of column(" + i + ") is: " + sumColumn(arr, i));
			
		}
	}

}
//output:
//Enter the Elements of 2D Array of 3x4: 
//1.5 2 3 4
//5.5 6 7 8
//9.5 1 3 1
//Sum of Elements are of column(0) is: 16.5
//Sum of Elements are of column(1) is: 9.0
//Sum of Elements are of column(2) is: 13.0
//Sum of Elements are of column(3) is: 13.0