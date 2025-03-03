package assignment1;
import java.util.*;
public class HA4 {
	
	public static double[][] addMatrix( double [][] a, double [][] b){
		double [][] c = new double[a.length][a[0].length];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
		}}
	return c;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of rows for 1st array: ");
		int rows1= in.nextInt();
		System.out.print("Enter no. of coulums for 1st array: ");
		int cols1= in.nextInt();
		double[][] arr1 = new double[rows1][cols1];
		System.out.print("Enter The Element of 2d array: ");
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				arr1[i][j] = in.nextDouble();
			}
		}
		System.out.print("Enter no. of rows for 2nd array: ");
		int rows2= in.nextInt();
		System.out.print("Enter no. of coulums for 2nd array: ");
		int cols2= in.nextInt();
		double[][] arr2 = new double[rows2][cols2];
		System.out.print("Enter The Element of 2d array: ");
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				arr2[i][j] = in.nextDouble();
			}
		}
		
		double[][] arr3 = new double[rows1][cols1];
		if (rows1==rows2) {
			if(cols1==cols2) {
				System.out.println("The Sum Of The Matrix is: " );
				arr3 = addMatrix(arr1, arr2);
				for(int i = 0; i<arr3.length; i++) {
					for(int j = 0; j<arr3.length; j++) {
						System.out.print(arr3[i][j] + " "); 
					}
					System.out.println();
				}
			}
			}
		
		

	}

}

//Enter no. of rows for 1st array: 2
//Enter no. of coulums for 1st array: 2
//Enter The Element of 2d array: 2 3 4 5
//Enter no. of rows for 2nd array: 2
//Enter no. of coulums for 2nd array: 2
//Enter The Element of 2d array: 2 3 4 5
//The Sum Of The Matrix is: 
//4.0 6.0 
//8.0 10.0 

