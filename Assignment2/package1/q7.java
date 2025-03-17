package package1;

class Shape{
	String color;
	Shape(String color){
		this.color = color;
	}
}

class Circle extends Shape{
	double Radius;
	Circle(String color, double Radius){
		super(color);
		this.Radius=Radius;
	}
	void area() {
		
		
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	
	Rectangle(String color, double length, double width){
		super(color);
		this.length=length;
		this.width=width;
	}
	void area() {
		
	}
}
public class q7 {

	public static void main(String[] args) {


	}

}
