package assignment3;
import java.util.Scanner;



public class A3Q02 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String arr[] = {"blue","yellow","green","pink","grey"}	;	

		try {
//		System.out.println(arr[6]);
			
//		arr[4]=null;
//		System.out.println(arr[4].length());
			
			int x =in.nextInt();
			arr[2]=x;
		
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("fggfg");
		}

	}

}
