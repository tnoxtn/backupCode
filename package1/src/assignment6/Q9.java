package assignment6;
import java.util.Scanner;
public class Q9 {


	public static boolean isValidPassword(String password) {
		//length must  be at least 8 digit
		if(password.length() < 8) {
			return false;
		}
		
		
		//password contains only letters and digits
		for(int i=0; i<password.length(); i++) {
			char check1 = password.charAt(i);
			if(!Character.isLetterOrDigit(check1)) {
				return false;
			}
		}
		
		
		//password must contains at least two digits
		int count = 0;
		for(int i=0; i<password.length(); i++) {
			char check2 = password.charAt(i);
			if(Character.isDigit(check2)) {
				count++;
			}
		}
		if (count < 2) {
            return false;
        }

        return true;
        
        
    }


	
	public static void main(String args[]) {
		Scanner inp = new Scanner (System.in);
		System.out.print("Enter The Password Here: ");
		String pass = inp.nextLine();
		
		//call the method
		if(isValidPassword(pass)) {
			System.out.println("It is a Valid Password");
		}
		else {
			System.out.println("It is an Invalid Password");
		}
	}

}

	}

}
