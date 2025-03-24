package package1;
import java.util.*;
class Employee{
String name;
double salary;

Employee(String name,double salary){
	this.name=name;
	this.salary=salary;
}

void displayEmployeeInfo(){
	System.out.println("Name: "+ name);
	System.out.println("Salary: "+salary);
}
}

class Manager extends Employee{
	String Department;
	Manager(String name,double salary,String Department){
		super(name, salary);
		this.Department=Department;
		
	}
	
	void displayManagerDetails() {
		super.displayEmployeeInfo();
		System.out.println("Department: "+Department);
	}
}
public class Q9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Name: ");
		String n = in.next();
		System.out.print("Enter Salary: ");
		double s = in.nextDouble();
		System.out.print("Enter Department: ");
		String d = in.next();
		
		Manager one = new Manager(n,s,d);
		one.displayManagerDetails();
	}

}
