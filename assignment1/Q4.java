package assignment1;
import java.util.*;
public class Q4 {
public static void main(String[] args) {
		
		String s = "CARBON";
		char ch[] = s.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			
			for(int j = 0; j<ch.length; j++) {
				if(i==j) {
					continue;
				}
				
				for(int k = 0; k<ch.length; k++) {
					if(i==k || j==k) {
						continue;
					}
					
					for(int l = 0; l<ch.length; l++) {
						if(i==l || j==l || k==l) {
							continue;
						}
						
						for(int m = 0; m<ch.length; m++) {
							if(i==m || j==m || k==m || l==m) {
								continue;
							}
							for(int n = 0; n<ch.length; n++) {
								if(i==n || j==n || k==n || l==n || m==n) {
									continue;
								}
								System.out.println("" + ch[i] + ch[j] +ch[k] +ch[l] +ch[m] +ch[n] );
							}
						}
					}
					
				}
			}
		}

	}

}

// output (6!)
//CARBON
//CARBNO
//CAROBN
//CARONB
//.
//.
//.
//NOBARC
//NOBRCA
//NOBRAC