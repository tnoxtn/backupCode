import java.util.Scanner;
import java.lang.Math;
public class Q2{
public static void main(String arg[]){

int a, b, power;
Scanner input = new Scanner(System.in);

System.out.println("enter number 1: ");
a = input.nextInt();

System.out.println("enter number 2: ");
b = input.nextInt();

power = (int) Math.pow(a, b);

System.out.println("a power b is: " + power);
}
}