package package1;

interface Flyable{
	void fly();
}

interface Swimmable{
	void swim();
}

class Duck implements Flyable,Swimmable{
	String name;
	Duck(String name){
		this.name=name;
	}
	public void fly(){
		System.out.println(name+" is Flying");
	}
	public void swim(){
		System.out.println(name+" is Swiming");
	}
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Abilities: ");
		fly();
		swim();
	}
}


public class Q8 {

	public static void main(String[] args) {
		Duck bob = new Duck ("Bob");
		bob.fly();
		bob.swim();
		bob.displayDetails();
	}

}
