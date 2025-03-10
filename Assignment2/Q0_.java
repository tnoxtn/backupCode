package Assignment2;

import java.util.Scanner;

class Time_{
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
	
	public Time_ add(Time_ one) {
		Time_ ans = new Time_();
		
			ans.mins = (one.mins+mins) % 60;
			ans.hrs= (one.hrs+hrs) + ((one.mins+mins)/60) ;
			
		return ans;
	}
public class Q0_ {

	public static void main(String[] args) {
		Time_ one = new Time_();
		Time_ two = new Time_();
		one.setData();
		two.setData();
		
		one.displayData();
		two.displayData();
		
		Time_ ans = new Time_();
		ans = one.add(two);
		ans.displayData();
		

	}

}
