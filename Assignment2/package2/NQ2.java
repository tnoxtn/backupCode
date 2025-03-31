package package2;

interface Flyablee{
	void fly();
	void display();
}

interface Swimmablee{
	void swim();
	void display();
}

class Ducks implements Flyablee,Swimmablee{
	String name;
	Ducks(String name){
		this.name=name;
	}
	public void fly(){
		System.out.println("Flying");
	}
	public void swim(){
		System.out.println("Swiming");
	}
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Abilities: ");
		fly();
		swim();
	}
}
public class NQ2 {
	public static void main(String[] args) {
		Flyablee f;
		f=new Ducks("Mike");
		f.fly();
		f.display();
		
		Swimmablee d;
		d=new Ducks("Tom");
		d.swim();
		d.display();
	}
	}

