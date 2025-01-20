package assignment6;

public class Q8 {
	public static boolean isPalindrome (String str) {
		String reverse = "";
		for (int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return (reverse.equals(str));
	}
	public static void main(String[] args) {
		String str= "racecar";
		if(isPalindrome(str)==true) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");

		}
	}

}

//It is a Palindrome