package lab25nov;

public class EmployeeSpecial extends Employee {

	private String specialSkil ;
	

	public EmployeeSpecial(String firstname, String lastname, String position, int salary) {
		super(firstname, lastname, position, salary);
	}
	
	public EmployeeSpecial(String firstname, String lastname, String position, int salary, String skill) {
		super(firstname, lastname, position, salary);
		this.specialSkil = skill;
	}
}
