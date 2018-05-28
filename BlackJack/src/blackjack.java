
public class blackjack {
	public static int TwoNums(int a, int b) {
		int c = 21;
		int z = c - a; /* total of c-a */
		int y = c - b; /* total of c-b */
/*		String error ="error";

		if (a < c) {
			System.out.println(error);
		} else if (b < c) {
			System.out.println(error);
		} else {
			System.out.println("cool");
		}*/
		if ((z >= y) && (a < c)) {
			return b;
		} else if ((y >= z) && (b < c)){
			return a;
		} else {
			return 0;
		}
	
		

		
	}
	public static void main(String args[]) {
		System.out.println(TwoNums(11, 16));
		/*System.out.println(error);*/
	}
	
	

}
