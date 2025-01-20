package assignment6;

public class Q7 {
	public static int count(String str) { 
		int vowels=0;
		for (int i = 0; i<str.length(); i++) {
			char c = Character.toLowerCase(str.charAt(i));
			if (c=='a' || c=='e'||c=='i'||c=='o'||c=='u') {
				vowels++;
			}
		}
		return vowels;
	}
	public static void main(String[] args) {
		String str="Welcome";
		System.out.println("Number of vowels: " + count(str));

	}

}
//Number of vowels: 3
