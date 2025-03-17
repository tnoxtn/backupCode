package package1;
class Vehicle{
	String Model;
	int year;
	
	Vehicle(String Model,int year){
		this.Model=Model;
		this.year=year;
	}
}
class Car extends Vehicle{
	int carId;
	double price;
	
	Car(String Model,int year, int carId, double price){
		super(Model,year);
		this.carId=carId;
		this.price=price;
	}
	
	void carDisplay() {
		System.out.println("Model: "+Model);
		System.out.println("Year: "+year);
		System.out.println("Car ID: "+carId);
		System.out.println("Price: "+price);
	}
}
public class q6 {

	public static void main(String[] args) {
		Car one = new Car ("Toyota", 2020, 458, 30000.0);
		one.carDisplay();

	}

}

//Model: Toyota
//Year: 2020
//Car ID: 458
//Price: 30000.0
