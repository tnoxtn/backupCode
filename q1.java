package circular;
import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(){
		Scanner in = new Scanner(System.in);
		data = in.nextInt();
		}
}

public class q1 {
	
	public static Node create(Node start) {
		Node newnode = new Node();
		start = newnode;
		start.next= start;
		
		Node temp = start;
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("Do you want to add more node (y/n)");
		char c = in.next().charAt(0);
		
		if(c=='n'||c=='N') {
			break;
		}
		
		Node newernode = new Node();
		newernode.next = start;
		temp.next = newernode;
		temp = temp.next;
	}
		return start;
	}
	
	public static void display(Node start) {
		Node temp = start;
		do {
			System.out.println("DATA: "+temp.data);
			temp=temp.next;
		}while(temp!=start);
	}
	
	public static Node insBeg (Node start) {
		Node newNode = new Node();

		Node temp = start;
//		do {
//			temp=temp.next;
//		}while(temp!=start);
		while(temp.next!=start) {
			temp=temp.next;
		}
		
		newNode.next = start;
		temp.next = newNode;
		start = newNode;
		
		return start;
	}
	
	public static void main (String[] args) {
		Node start = null;
		
		start = create(start);
		
		display(start);
		
		start = insBeg(start);
		
		display(start);
	}

}
