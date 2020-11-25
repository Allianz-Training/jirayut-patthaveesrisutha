package lab25nov;


public class Employee {
	public String firstname, lastname;
	public String position;
	private int salary;
	public static int holiday = 10;

	public Employee(String firstname, String lastname, String position, int salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.salary = salary;
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println(getFullname() + " position is: " + position);
	}

	public String getFullname() {
		return firstname + " " + lastname;
	}
	
	public static int getHoliday() {
		return holiday;
	}
	
	public static void showHoliday() {
		System.out.println("Get employee holiday from void method " + holiday);
	}
}
