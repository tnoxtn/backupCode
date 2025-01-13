package package1;

public class HA1 {

		public static void main(String[] args) {
			int rows = 5;
			for (int i = 1; i<= rows; i++) {
				for (int j = rows; j>= 1; j--) {
					if (i==j) {
						System.out.print("*");
						continue;
					}
					System.out.print(i);
				}
				System.out.println();
			}

		}

	}

//1111*
//222*2
//33*33
//4*444
//*5555