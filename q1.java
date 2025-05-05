package assigment4;
import java.util.Scanner;


class Node{
	protected int regno;
	protected float marks;
	protected Node next;
	
	Node(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the register no: ");
		regno = in.nextInt();
		System.out.println("Enter the marks: ");
		marks = in.nextFloat();
	}
}
public class q1 {

	public static Node create(Node start) {
		Scanner in = new Scanner(System.in);
		Node newNode = new Node();
		start=newNode;
		
		Node temp = start;
		while(true) {
			System.out.println("Do you want to create more (Y/N): ");
			char c = in.next().charAt(0);
			
			if (c=='n' || c=='N') {
				break;
			}
			Node nodeNew = new Node();
			temp.next=nodeNew;
			temp = newNode;
			
		}
		return start;
	}
	
		public static Node display(Node start) {
			Node temp = start;
			while(temp!=null) {
				System.out.println("Reg no: " + temp.regno+ ", Marks: " + temp.marks);
				temp  = temp.next;
			}
			return start;
		}
	
	
		public static int count(Node start) {
			int cnt=0;
			Node temp = start;
			while(temp!=null) {
				cnt++;
				temp  = temp.next;
			}
			return cnt;
		}
		
		
		public static void search(Node start) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the register number you wanna search: ");
			int key = in.nextInt();
			
			Node temp = start;
			while (temp!=null || temp.regno!=key) {
				temp=temp.next;
			}
			if(temp.regno==key) {
				System.out.println("Enter the Marks: ");
				temp.marks= in.nextFloat();
			}else {
				System.out.println("404 not found");
			}
		}
		
		
		public static Node insBeg(Node start) {
			Scanner in = new Scanner(System.in);
			Node newNode = new Node();
			newNode.next = start;
			start = newNode;
			
			return start;
		}
		
		public static Node insEnd(Node start) {
			Node newNode = new Node();
			
			Node temp = start;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = newNode;
			
			return start;
		}
		
		public static Node insAny(Node start) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the position: ");
			int pos = in.nextInt();
			
			Node newNode = new Node();
			
			Node temp = start;
			for(int i=0; i<pos-1; i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next = newNode;
			
			return start;
		}
		
		public static Node delBeg(Node start) {
			start = start.next;
			return start;
		}
		
        public static Node delEnd(Node start) {
        	Node temp = start;
        	while (temp.next!=start) {
        		temp=temp.next;
        	}
        	temp.next=null;
			
        	return start;
		}

        public static Node delAny(Node start) {
        	Scanner in = new Scanner(System.in);
			System.out.println("Enter the position: ");
			int pos = in.nextInt();
			
			Node temp = start;
			for(int i=0; i<pos-1; i++) {
				temp=temp.next;
			}
			temp.next = temp.next.next;
        	return start;
}
        
        public static Node sort (Node start) {
        	Node prev = start;
        	Node temp= start.next;
        	
        	while(temp.next!=null) {
        		if(prev.regno>temp.regno) {
        			int t = prev.regno;
        			prev.regno = temp.regno;
        			temp.regno=t;
        		}
        		prev=temp;
        		temp= temp.next;
        	}
        	return start;
        }
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node start=null;
		
		while(true) {
		System.out.println("1.for create"+ "/n2.for count"+"/n3.for display"+ "/n4.insert in beginning"+ "/n5.insert in end" + "/n6.insert at any position"+ "/n7.delete in beginning"+ "/n8.delete in end" + "/n9.delete at any position" + "/n10.to sort" +"/n11.to search");
		
		int x = in.nextInt();
		
		switch(x) {
		case 1:
			create(start); break;
		case 2: 
			count(start); break;
		case 3:
			display(start); break;
		
		case 4: 
			insBeg(start); break;
		case 5:
			insEnd(start); break;
		case 6:
			insAny(start); break;
		
		case 7:
			delBeg(start); break;
		case 8:
			delEnd(start); break;
		case 9:
			delAny(start); break;
		case 10:
			sort(start); break;
		case 11:
			search(start); break;
		
		}
		}
		
		

	}

}
