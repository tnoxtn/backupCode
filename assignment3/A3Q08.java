package assignment3;

public class A3Q08 {
	
	public static int exp (int x, int n){
		if(n==1) {
			return x;
		}
		return x * exp(x,(n-1));
	}
	public static void main(String[] args) {
		System.out.println(exp(5,3));

	}

}
