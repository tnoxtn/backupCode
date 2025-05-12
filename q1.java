package assignment5;
import java.util.*;

public class q1 {
	static int top = -1;
	static final int max = 10;
	
	public static boolean isEmpty() {
		return top==-1;
	}
	public static boolean isFull() {
		return top==max-1;
	}
	
	public static int push(int s[]) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return top;
		}
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Element: ");
		int item = sc.nextInt();
		top++;
		s[top]=item;
		
		return top;
	}
	
	public static int pop(int s[]) {
		if(isEmpty()) {
			System.out.println("Satck Underflow");
			return top;
		}
		System.out.println("Deleted Element: "+ s[top]);
		top--;
		
		return top;
	}
	
	public static void display(int s[]) {
		if(isEmpty()) {
			System.out.println("Satck Underflow");
			return;
		}
		for(int i = top; i>=0; i--) {
			System.out.println(s[i]);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = new int[max];
		
		while(true) {
		System.out.println("Enter the operation: ");
		int op = sc.nextInt();
		
		switch(op) {
		case 0: System.exit(0);
		case 1: isEmpty(); break;
		case 2: isFull(); break;
		case 3: top = push(arr); break;
		case 4: top= pop(arr); break;
		case 5: display(arr); break;
		default: System.out.println("invalid");
		}
		}
		
	}

}
