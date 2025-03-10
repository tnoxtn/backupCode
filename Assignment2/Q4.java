package Assignment2;

class Deposit{
	long principal;
	int time;
	double rate;
	double Total_amt;
	
	Deposit(){
		
	}
	Deposit(long p, int t, double r){
		principal=p;
		time=t;
		rate=r;
	}
	Deposit(long p, int t){
		this (p,t,2.5);
	}
	Deposit(long p, double r){
		this (p,2,r);
	}
	
	void display(){
		System.out.println("Principlal: "+principal);
		System.out.println("Time: "+time);
		System.out.println("Rate: "+rate);
	System.out.println("Total Amount: " + Total_amt); 
	}
	void calc_amt() {
		Total_amt = principal + ((principal*rate*time)/100);
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		Deposit one = new Deposit();
		Deposit two = new Deposit(200000, 3);
		Deposit three = new Deposit(30000000L, 3, 2.5);
		Deposit four = new Deposit(1000000L, 2.5);
		
		Deposit arr[] = {one,two,three,four};
		for(int i =0; i<arr.length;i++) {
			arr[i].calc_amt();
			arr[i].display();
		}
		
	
	}

}
