
public class TooHawt {
	
	public static boolean Degree(int temperature, boolean isSummer) {
		int limit = 90;
		
		if (isSummer == true) {
			limit = 100;
		}
		if (temperature >= 60 && temperature <= limit) {
			 return true;
		} else {
			return false;
		}
	}
	public static void main(String args[]) {
		System.out.println(Degree(70, true));
	}
}
