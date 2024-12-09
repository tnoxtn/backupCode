package Package1;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the SCORE: ");
double scr = input.nextDouble();
int score = (int) scr/10;

if (scr>100 || scr<0) {
	System.out.println("invalid score");
}
else {
switch(score) {
		case 10,9:
			System.out.println("Score = O");
		break;
		case 8:
			System.out.println("Score = A");
			break;
		case 7:
			System.out.println("Score = B");
			break;
		case 6:
			System.out.println("Score = C");
			break;
		case 5:
			System.out.println("Score = D");
			break;
		case 4:
			System.out.println("Score = E");
			break;
		default:
			System.out.println("fail");

	}

}
}
}