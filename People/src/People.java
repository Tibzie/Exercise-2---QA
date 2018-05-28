

public class People {
	
	String name;
	int age;
	String job_title;
	
	

	public People(String name, int age, String job_title) {
		this.name = name;
		this.age = age;
		this.job_title = job_title;
	}
    public String toString() {
    	return name + " - " + age + " - " + job_title + "\n";   		
    }
}	