package assignment3;

public class A3Q05 {

	public static <E> void printArray (E[] inputArray) {
		for(int i =0; i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");
		}
	}
	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9};
		String b[] = {"yo", "whats","good"};
		Character c[] = {'a','b','c'};
		
		printArray(a); System.out.println();
		printArray(b); System.out.println();
		printArray(c); System.out.println();
	}

}
