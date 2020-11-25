package lab25nov;

public class Programmer extends Employee {
	public int wpm;
	
	public Programmer(String firstname, String lastname, String position, int salary) {
		super(firstname, lastname, position, salary);
	}
	
	public Programmer(String firstname, String lastname, String position, int salary,int wpm) {
		super(firstname, lastname, position, salary);
		this.wpm = wpm;
	}

	public void tellWPM() {
		System.out.println("My word per minute is: " + wpm);
	}
}
