
import java.util.ArrayList;

public class TakePeople {

	/*public class Title extends People{
		public String Prefix(String title) {
			return title;
			
		}

		

	}*/

	public static void main(String args[]) {
		;
		People anna = new People("Anna Woodbury", 28, "UX Designer");
	    People thomas = new People("Thomas Thompson", 25, "Web Designer");
	    People john = new People("John Hawk", 29, "Full Stack Developer");
	   
	    ArrayList<People>people = new ArrayList<People>();
	    people.add(anna);
	    people.add(thomas);  
	    people.add(john);
	   
	    
	    for (People details:people) {
	    	System.out.println(details);
	    }
	    
	    //System.out.println(people);
//		    for (People str:people) {
//		    	System.out.println(Arrays.toString(str));
//		    }	    	
	    }

	}   


