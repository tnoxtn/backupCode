package assignment7;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

//	int[] a = {10, 5, 12, 65, 21, 0, 42, 65, 25};
	System.out.print("Enter 5 Elements: ");
	int a[] = new int [5];
	for(int x=0; x<a.length; x++) {
		a[x] = in.nextInt();
	}
	
	System.out.println("Before Sorting:");
	for(int num : a) {
		System.out.print(num + " ");
		
	for (int i = 0; i<a.length; i++) {
		int minindex=i;
		for (int j = i+1; j<a.length; j++) {
			if(a[j] < a[minindex]) {
				minindex= j;
			}
		
		}
		int temp= a[i];
		a[i] = a[minindex];
		a[minindex] = temp;
	}
}
	System.out.println();
	System.out.println("After Sorting:");
	for(int num : a) {
		System.out.print(num + " ");
	}
	
	}
}
//Enter 5 Elements: 2 1 6 4 7
//Before Sorting:
//2 2 4 6 7 
//After Sorting:
//1 2 4 6 7 