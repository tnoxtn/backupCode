package assignment7;
import java.util.Scanner;

public class AQ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 10 Elements: ");
        
        int arr[] = new int[10];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = in.nextInt();
        }

        bubbleSort(arr); // Call the sorting method

        System.out.println("After Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) { // Optimized to avoid unnecessary checks
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

//Enter 10 Elements: 44 66 88 22 11 99 00 44 33 22 
//After Sorting:
//0 11 22 22 33 44 44 66 88 99 
