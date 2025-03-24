package package1;

class Shapes{
	String color;
	Shapes(String color){
		this.color = color;
	}
}

class Circles extends Shapes{
	double Radius;
	double area;
	Circles(String color, double Radius){
		super(color);
		this.Radius=Radius;
	}
	void area() {
	area= Math.PI*Radius*Radius;
	System.out.println("Area: "+area);
	}
	void display() {
		System.out.println("Shape Details: Circle");
		System.out.println("Color: "+ color);
		System.out.println("Radius: "+Radius);
		area();
	}
}
class Rectangles extends Shapes{
	double length;
	double width;
	double area;
	
	Rectangles(String color, double length, double width){
		super(color);
		this.length=length;
		this.width=width;
	}
	void area() {
		area=length*width;
		System.out.println("Area: "+area);
	}
	void display() {
		System.out.println("Shape Details: Rectangle");
		System.out.println("Color: "+ color);
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		area();
	}
}
public class q7 {

	public static void main(String[] args) {
Circles one = new Circles("Green", 44.0);
Rectangles two = new Rectangles("Yellow", 35.0, 47.0);
one.display();
System.out.println();
two.display();
//fix this use scanner
	}

}
