package lab25nov;

public class Main {
	public static void main(String[] args) {
		Employee em1 = new Employee("Jirayut", "Patthaveesrisutha", "Back End Developer", 12345);
		em1.hello();
		em1.checkPosition();
		System.out.println();

		Employee em2 = new Employee("Em2", "Lastname2", "CEO", 99999);
//		String fullname = em2.getFullname();
//		System.out.println(fullname);
		System.out.println(em2.getFullname());
		System.out.println();

		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("name" + i, "last" + i, "position" + i, (i + 1) * 10000);
		}

		for (Employee em : employees) {
			System.out.println(em.getFullname());
		}
		System.out.println();

		System.out.println("Get employee holiday from return method " + Employee.getHoliday());
		Employee.showHoliday();

		System.out.println("Lab5 ==========================");
		CEO ceo = new CEO("Time", "The CEO", "CEO", 50000);
		System.out.println(ceo.getSalary());
		System.out.println("call method from sub class");
		ceo.hello();
		ceo.fire(em1);
		System.out.println("===access method and variable from super class===");
		System.out.println(ceo.firstname);
		System.out.println(ceo.getFullname());
		System.out.println("===create new variable and method===");
		ceo.ceoIsCrazyToTellSecretPass();
		System.out.println("===create Programmer class that extends from employee===");
		Programmer pg = new Programmer("Time", "The Programmer", "Programmer", 23142, 99);
		pg.tellWPM();

		EmployeeSpecial thor = new EmployeeSpecial("Thor", "lastname", "God", 1200000, "Thunder");
//		
//		Employee[] employees2 = {ceo,em1,pg};
//		
//		for (Employee employee : employees2) {
//			System.out.println(employee);
//		}
		
		Employee pgtEmployee = new CEO("Em", "CEO", "CEO", 444);
		System.out.println(pgtEmployee.getSalary());
		
	}
}
