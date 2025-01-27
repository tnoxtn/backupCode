package array;
import java.util.Scanner;

public class AQ02 {


	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter numbers between 1 to 100 (enter 0 to stop): ");

	        int[] arr = new int[101]; // Array to store counts of numbers

	        while (true) {
	            int n = in.nextInt();
	            if (n == 0) {
	                break; // Stop taking inputs when 0 is entered
	            } else if (n >= 1 && n <= 100) {
	                arr[n]++; // Increment count for the entered number
	            } else {
	                System.out.println("Please enter a number between 1 and 100.");
	            }
	        }

	        // Print the counts of numbers
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == 1) {
	                System.out.println(i + " occurs " + arr[i] + " time");
	            } else if (arr[i] > 1) {
	                System.out.println(i + " occurs " + arr[i] + " times");
	            }
	        }

	        in.close(); // Close the scanner to avoid resource leaks
	    }
	}
