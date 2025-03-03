package assignment1;
import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows= in.nextInt();
		System.out.print("Enter no. of coulums: ");
		int cols= in.nextInt();
		int[][] arr = new int[rows][cols];
		
		int sum = 0;
		System.out.print("Enter The Element of 2d array: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				arr[i][j] = in.nextInt();
				sum += arr[i][j];
			}
		}
		
		System.out.println("The Elements of 2d Array are: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			}
		
		System.out.println("Sum of 2d array is: " + sum);
		
		

	}

}

//output:
//Enter no. of rows: 3
//Enter no. of coulums: 3
//Enter The Element of 2d array: 2 3 4 5 6 7 8 9 0
//The Elements of 2d Array are: 
//2 3 4 
//5 6 7 
//8 9 0 
//Sum of 2d array is: 44
