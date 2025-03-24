package package1;
import java.util.Scanner;
abstract class Shape{
	abstract void area() ;
}
class Square extends Shape{
	int side;
	double area;
	void area() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Side of Square: ");
		side = in.nextInt();
		area=side*side;
		System.out.println("Area of Square: "+area);
		
	}
}
class Triangle extends Shape{
	int base;
	int height;
	double area;
	void area() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Base of Triangle: ");
		base = in.nextInt();
		System.out.print("Enter Height of Triangle: ");
		height = in.nextInt();
		area=0.5 * base * height;
		System.out.println("Area of Triangle: "+area);
		
	}
}
class Circle extends Shape{
	int radius;
	double area;
	void area() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Radius of Circle: ");
		radius = in.nextInt();
		area= Math.PI*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
}
public class q5 {

	public static void main(String[] args) {
		Square one = new Square();
		Triangle two = new Triangle();
		Circle three = new Circle();
		
		one.area();
		two.area();
		three.area();

	}

}

//Enter Side of Square: 3
//Area of Square: 9.0
//Enter Base of Triangle: 5
//Enter Height of Triangle: 9
//Area of Triangle: 22.5
//Enter Radius of Circle: 2
//Area of Circle: 12.566370614359172
