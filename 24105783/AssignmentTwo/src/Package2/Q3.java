package Package2;
/*Write a java program that prints the sum of two random integers between 1 and 6 (such as 
you might get when rolling dice)*/
public class Q3 {

	public static void main(String[] args) {
		
		int a = (int) (Math.random()*6 +1);
		int b = (int) (Math.random()*6 +1);
		int c = a + b;
        System.out.println(c);
	}

}
