package assignment1;
import java.util.*;

public class Q9 {
	public static double  sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m.length; j++) {
				if (i == j) {
					sum += m[i][j];
				}
			}
			}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of rows and coulums (N X N FORM): ");
		int size = in.nextInt();
		double [][] arr = new double[size][size];
		System.out.print("Enter The Element of 2d array " + size + "x" + size + " form: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				arr[i][j] = in.nextDouble();
			}
		}
		
		System.out.println("Sum of Elements are: " + sumMajorDiagonal(arr));
		

	}

}

//output:
//Enter no. of rows and coulums (N X N FORM): 4
//Enter The Element of 2d array 4x4 form:  1 2 3 4 5 6.5 7 8 9 10 11 12 13 14 15 16
//Sum of Elements are: 34.5
