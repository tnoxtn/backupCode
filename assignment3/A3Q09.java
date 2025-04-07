package assignment3;

public class A3Q09 {
	public static int reverse(int num, int rev) {
		if(num==0){
			return rev;
		}
		return rev + reverse(num/10, rev*10+num%10);
	}

	public static void main(String[] args) {
		int rev=0;
		reverse(4567,rev);

	}

}
