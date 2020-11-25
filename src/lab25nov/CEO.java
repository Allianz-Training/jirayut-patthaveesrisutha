package lab25nov;

public class CEO extends Employee {
	private String secretCEOPass = "4123";
	public CEO(String firstname, String lastname, String position, int salary) {
		super(firstname, lastname, position, salary);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary()*2;
	}
	
	public void hello() {
		System.out.println("Hi "+this.firstname+"!");
	}
	
	public void fire(Employee emp) {
		System.out.println(emp.firstname + " has been fired!");
	}
	
	public void ceoIsCrazyToTellSecretPass() {
		System.out.println("My safe code is " + secretCEOPass);
	}
}
