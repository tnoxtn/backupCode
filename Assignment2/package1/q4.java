package package1;


class Deposit{
	long principal;
	double rate;
	int time;
	double Total_amt;
	
	Deposit(){
		
	}
	
	Deposit(long p, int t, double r){
		principal=p;
		time=t;
		rate=r;
	}
	
	Deposit(long p, int t){
		this(p,t,2.5);
	}
	
	Deposit(long p, double r){
		this(p,2,r);
	}
	
	void display() {
		System.out.println("Principal: "+principal);
		System.out.println("Time: "+time);
		System.out.println("Rate: "+rate);
		System.out.println("Total Amount: "+Total_amt);
	}
	
	void calcAmt() {
		Total_amt = principal + (principal*rate*time)/100.0;
	}
}
public class q4 {

	public static void main(String[] args) {
		Deposit d1 = new Deposit();
		Deposit d2 = new Deposit(200000, 3);
		Deposit d3 = new Deposit(3000000,2,6.0);
		Deposit d4 = new Deposit(40000, 10.0);
		
		Deposit d[]= {d1,d2,d3,d4};
		
		for(int i =0; i<4; i++) {
			d[i].calcAmt();
			d[i].display();
		}
		

	}

}

//Principal: 0
//Time: 0
//Rate: 0.0
//Total Amount: 0.0
//Principal: 200000
//Time: 3
//Rate: 2.5
//Total Amount: 215000.0
//Principal: 3000000
//Time: 2
//Rate: 6.0
//Total Amount: 3360000.0
//Principal: 40000
//Time: 2
//Rate: 10.0
//Total Amount: 48000.0
