package assignment7;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.print("Enter 10 Elements: ");
	int arr[] = new int [10];
	for(int x=0; x<arr.length; x++) {
		arr[x] = in.nextInt();
	}
	System.out.println();
	System.out.print("enter the number to be searched: ");
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
//Enter 10 Elements: 9 8 7 6 5 5 4 3 2 1
//enter the number to be searched: 5
//5 is present 2 times