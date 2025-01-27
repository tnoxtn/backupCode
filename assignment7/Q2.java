package assignment7;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter no between 1 to 100 (enter 0 to stop): ");
		
		int[] arr = new int[101];
		
		while(true) {
			int n = in.nextInt();
			if(n==0) {
				break;
			}
			else {
				arr[n]++;
			}
			
			for (int i = 0; i< arr.length; i++) {
				if(arr[i]==1) {
				System.out.println(i + " occurs " + " " + arr[i] + "time");
				}
				else if (arr[i]>1) {
					System.out.println(i + " occurs " + " " + arr[i] + "times");

				}
			}
		}
	}

}
