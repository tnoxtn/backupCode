package Assignment2;
import java.util.*;
class Time{
	int hrs;
	int mins;
	
	void setData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Hours: "); hrs = in.nextInt();
		System.out.println("Enter The Minutes: "); mins = in.nextInt();
		
	}
	
	void displayData() {
		System.out.println(hrs+":"+mins);
	}
	
	public Time add(Time one, Time two) {
		Time ans = new Time();
		
			ans.mins = (one.mins+two.mins) % 60;
			ans.hrs= (one.hrs+two.hrs) + ((one.mins+two.mins)/60) ;
			
		return ans;
	}
}
public class Q0 {

	public static void main(String[] args) {
		Time one = new Time();
		Time two = new Time();
		one.setData();
		two.setData();
		
		one.displayData();
		two.displayData();
		
		Time ans = new Time();
		ans = ans.add(one, two);
		ans.displayData();
		

	}

}

//Enter The Hours: 
//5
//Enter The Minutes: 
//45
//Enter The Hours: 
//1
//Enter The Minutes: 
//20
//5:45
//1:20
//7:5
