import java.util.Scanner;
public class Q1{
public static void main(String arg[]){

int dnt, dsr;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the dividend");
dnt = sc.nextInt();

System.out.println("Enter the divisor");
dsr = sc.nextInt();

int quo = (int) (dnt/dsr);
int rem = dnt % dsr;

System.out.println("Quotient is " + quo);
System.out.println("Reminder is " + rem);
}
}