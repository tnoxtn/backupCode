package package1;

public class Q7A {

	public static void main(String[] args) {
		int rows = 5; int a = 1;
		for (int i = 1; i<= rows; i++) {
			for (int j = 1, c=65; j<= i; j++) {
				System.out.print((char) c++ + " ");
			}
			System.out.println();
		}

	}

}

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
