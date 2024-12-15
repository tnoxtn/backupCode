package Package1;
import java.util.Scanner;
public class Q5 {

	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the year: ");
        int year = input.nextInt();
        
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year: true");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year: true");
        } else {
            System.out.println(year + " is a leap year: false");
        }
    }

}

//op
//Enter Any Year: 2024
//True
