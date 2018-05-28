
public class UniqueSum {
	public static int ThreeValues(int a, int b, int c) {
		int sum = 0;
		
		
		if (a == b) {
			return c;
		} else if (b == c){
			return a;
		} else if (c == a) {
			return b;
		} else if ((a != b) && (b != c) && (c != a)) {
			sum = a + b + c;
		} else {
			return 0;
		}
		return sum;
	}
	public static void main(String args[]) {
		System.out.println(ThreeValues(11, 12, 12));
	}
}
