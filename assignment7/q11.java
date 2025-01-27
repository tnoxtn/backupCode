
package assignment7;
import java.util.Scanner;
public class q11 {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.print("Enter 10 Elements: ");
	int arr[] = new int [10];
	for(int x=0; x<arr.length; x++) {
		arr[x] = in.nextInt();
	}
	
	
	for (int i = 0; i<arr.length; i++) {
	   for (int j = 1; j<arr.length; j++) {
		   if (arr[j-1]>arr[j]) {
			   int temp = arr[j-1];
			   arr[j-1] = arr[j];
			   arr[j]= temp;
		   }
	   }
	}
	System.out.println("After Sorting:");
for(int num : arr) {
	System.out.print(num + " ");
}

}
}
//Enter 10 Elements: 44 66 88 22 11 99 00 44 33 22 
//After Sorting:
//0 11 22 22 33 44 44 66 88 99 