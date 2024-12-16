package assignment4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
System.out.print("enter a number: ");
int n = in.nextInt();
int x = 0;
while (n>0) {
	x += n% 10;
	n = n/10;
}

if (x % 9 == 0) {
	System.out.println("divisible by 9");
}
else
{
	System.out.println("not divisible by 9");
}
	

	
	
	
	}

}

//output
//enter a number: 123456
//not divisible by 9