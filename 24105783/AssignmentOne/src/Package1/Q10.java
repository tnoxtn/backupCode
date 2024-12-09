package Package1;

//Author name: Tanmaya Nayak
//Author registration no: 24105783
//Author Semester: 1st
//Author Branch-Section: CSE-H2
//Subject: Introduction to Computer Programming
//Questions Details: (Assignment1, Q10) Q10 to print numerical pattern

public class Q10 {

	public static void main(String[] args) {
		String ruler1 = "1";
		String ruler2 = ruler1 + " 2 " + ruler1;
		
		System.out.println(ruler1);
		System.out.println(ruler2);
		System.out.println(ruler2 + " 3 " + ruler2);
		System.out.println(ruler2 + " 3 " + ruler2 + " 4 " + ruler2 + " 3 " + ruler2);

	}

}


//output- 
/*
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
*/