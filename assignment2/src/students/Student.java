package students;
import java.util.*;

public class Student {
String name;
int roll;

public void inputDetails() {
	Scanner in = new Scanner (System.in);
	System.out.print("Enter Name: ");
	name = in.next();
	System.out.print("Enter Roll: ");
	roll = in.nextInt();
}
public void showDetails() {
	System.out.print("Name: "+ name);
	System.out.print("Roll No.: "+roll);
}
	
}

