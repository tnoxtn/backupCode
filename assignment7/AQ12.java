package array;
import java.util.Scanner;

public class AQ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        
        int a[] = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for (int x = 0; x < a.length; x++) {
            a[x] = in.nextInt();
        }

        System.out.println("Before Sorting:");
        printArray(a); // Using method to print array

        selectionSort(a); // Call the sorting method

        System.out.println("After Sorting:");
        printArray(a); // Print sorted array
        
        in.close();
    }

    // Selection Sort Method
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
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
