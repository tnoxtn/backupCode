package array;
import java.util.Scanner;
public class AQ03 {

		public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter 10 Elements: ");
		int arr[] = new int [10];
		for(int x=0; x<arr.length; x++) {
			arr[x] = in.nextInt();
		}
		
		System.out.println("Enter the number to be searched: ");
		int search = in.nextInt();
		
		int count = 0;
		
		for(int num: arr) {
			if(num == search) {
				count++;
			}
		}
		
		System.out.println(search + " is present "+ count + " times");


	}
	}
//Enter 10 Elements: 5 4 5 2 6 1 5 2 4 6
//Enter the number to be searched: 
//5
//5 is present 3 times
	
	
	
	
