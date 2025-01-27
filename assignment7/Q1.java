package assignment7;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
System.out.print("enter the size of the array: ");
int n = in.nextInt();
int[] arr = new int[n];
int sum = 0;
int avg = 0;
System.out.println("value of array are: ");
for(int i=0; i<n; i++ ) {
	arr[i]= (int) (Math.random()*100) +1;
	System.out.print(arr[i] + " ");
	sum += arr[i];
}
avg = sum/n;
System.out.println();
System.out.println("sum of array is: " + sum);
System.out.println("Average of array is: " + avg);
	}

}

//enter the size of the array: 5
//value of array are: 
//58 13 71 23 88 
//sum of array is: 253
//Average of array is: 50
