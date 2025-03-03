package assignment1;

public class HA5 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		System.out.print("Enter The Element of 2d array: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				arr[i][j] = ((int) (Math.random()*2));
			}
			}
		System.out.println("The Matrix is : ");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();
		}

			
	}

}
