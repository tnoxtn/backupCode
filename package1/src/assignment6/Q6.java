package assignment6;

public class Q6 {

	public static int count(String str , char a) {
		int cnt=0;
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)==a) {
				cnt++;
			}
			
		}
		return cnt;
	}
	public static void main(String[] args) {
    System.out.println(count("Welcome", 'e'));
	}

}

//2