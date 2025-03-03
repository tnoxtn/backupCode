package assignment1;
import java.util.*;
public class Q7 {
	public static int maximum (int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max= arr[i];
			}
		}
		return max;
	}
	public static int minimum (int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]<min) {
				min= arr[i];
			}
		}
		return min;
	}
	public static int count(int arr[], int x) {
		int cnt=0;
		int pos = 0;
	
		for(int i=0; i<arr.length; i++) {
		if(arr[i] == x) {
			cnt++;
		}
	}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Size of array: ");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<array.length; i++) {
		array[i] = in.nextInt();
	}
		int max = maximum(array);
		int min = minimum(array);
		
		System.out.println("The Largest Elemnt is: " + max + " Which occurs: "+ count(array, max) + " times");
		System.out.println("The Smallest Elemnt is: " + min + " Which occurs: "+ count(array, min) + " times");
		
		int maxPos =0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == max) {
				maxPos = i + 1;
				break;
			}
		}
		int minPos =0;
		for(int i=(array.length)-1; i>=0; i--) {
			if(array[i] == min) {
				minPos = i+1;
				break;
			}
		}
		
		System.out.println("Position of max: " + maxPos);
		System.out.println("Position of min: " + minPos);


}
}

//output:
//Enter the Size of array: 5
//Enter the elements of array: 
//33 4 33 4 9
//The Largest Elemnt is: 33 Which occurs: 2 times
//The Smallest Elemnt is: 4 Which occurs: 2 times
//Position of max: 1
//Position of min: 4