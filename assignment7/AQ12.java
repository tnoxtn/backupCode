package array;
import java.util.Scanner;
public class AQ12 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
System.out.print("Enter size of array: ");
int size = in.nextInt();
	        System.out.println("Enter " + size +" Elements: ");
	        int a[] = new int[size];
	        for (int x = 0; x < a.length; x++) {
	            a[x] = in.nextInt();
	        }

	        System.out.println("Before Sorting:");
	        for (int num : a) {
	            System.out.print(num + " ");
	        }

	        // Selection sort logic
	        for (int i = 0; i < a.length; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j] < a[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap the minimum element with the first unsorted element
	            int temp = a[i];
	            a[i] = a[minIndex];
	            a[minIndex] = temp;
	        }

	        System.out.println();
	        System.out.println("After Sorting:");
	        for (int num : a) {
	            System.out.print(num + " ");
	        }

	        in.close();
	    }
	}

//Enter size of array: 7
//Enter 7 Elements: 
//9
//3
//6
//1
//8
//5
//0
//Before Sorting:
//9 3 6 1 8 5 0 
//After Sorting:
//0 1 3 5 6 8 9 
