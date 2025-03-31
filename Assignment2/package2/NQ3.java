package package2;

class Student{
	private String name;
	private String RegNo;
	final static String dept= "CSE";
	static int slNo=0;
	
	Student (String name,String RegNo){
		this.name=name;
		this.RegNo=RegNo;
	}
	void display() {
		System.out.print(""+slNo++);
		System.out.print("\t"+name);
		System.out.print("\t"+RegNo);
		System.out.print("\t"+dept);
	}
}

class Institute extends Student{
	int mark1, mark2;
	
	Institute(String name,String RegNo,int mark1, int mark2){
		super(name,RegNo);
		this.mark1=mark1;
		this.mark2=mark2;
	}
	double calculate() {
		return (mark1+mark2)/2.0;
	}
	void display() {
		super.display();
		System.out.print("\t"+calculate());
	}
}

class Placement extends Institute{
	String Company;
	Placement(String name,String RegNo,int mark1, int mark2, String Company){
		super(name, RegNo, mark1, mark2);
		this.Company=Company;
	}
	String elegible() {
		if(calculate()>=75) {
			return ("allowed");
		}
		else {
			return("not allowed");
		}
	}
	
	void display() {
		super.display();
		System.out.print("\t"+Company);
		System.out.print("\t"+elegible()+"\n");
	}
}

public class NQ3 {

	public static void main(String[] args) {
		System.out.println("Sl no"+ "\tName"+"\t\tReg no"+"\tDept"+ "\tMarks" + "\tCompany"+ "\tRemarks");
		Placement s1 = new Placement("Tanmaya Nayak", "4A65", 70, 80, "Nvidia"); s1.display();
		Placement s2 = new Placement("Mukund Singh", "A5G6", 90, 70, "Amazon"); s2.display();
		Placement s3= new Placement("Rohan Roy", "S3G6", 60, 50, "Google"); s3.display();
		

	}

}
