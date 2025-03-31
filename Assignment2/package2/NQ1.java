package package2;

abstract class Shapess{
	double dim1, dim2;
	
	Shapess(double dim1, double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}


Shapess(double dim1){
	this.dim1=dim1;
}

abstract double area();

void display() {
	System.out.println("Area of the Shape is: "+ area());
}

}

class Circless extends Shapess{
	Circless(double r){
		super(r);
	}
	double area() {
		return Math.PI*dim1*dim1;
	}
	void display() {
		super.display();
	}
}

class Rectangless extends Shapess{
	Rectangless(double l, double w){
		super(l,w);
	}
	double area() {
		return dim1*dim2;
	}
	void display() {
		super.display();
	}
}

class Triangless extends Shapess{
	Triangless(double b, double h){
		super(b,h);
	}
	double area() {
		return 0.5*dim1*dim2;
	}
	void display() {
		super.display();
	}
}

class Squaress extends Shapess{
	Squaress(double s){
		super(s);
	}
	double area() {
		return dim1*dim1;
	}
	void display() {
		super.display();
	}
}

public class NQ1 {

	public static void main(String[] args) {
//		Circless c = new Circless(2.5); c.display();
//		Rectangless r = new Rectangless(3,4); r.display();
		
		// using the abstrtact class to create objects
		Shapess s ;
		s = new Circless(2.5);
		s.display();
		s= new Rectangless(3,4);
		s.display();
		s= new Triangless(3,7);
		s.display();
		s=new Squaress(5);
		s.display();
		

	}

}
