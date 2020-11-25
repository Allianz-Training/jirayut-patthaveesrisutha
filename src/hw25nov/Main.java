package hw25nov;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2 = new Circle(2.5);

		System.out.println("Hw5-6 OOP1 ==================");
		System.out.println(circle);
		System.out.println("Circle area: " + circle.getArea());
		System.out.println("Circle circumference: " + circle.getCircumference());
		System.out.println(circle2);
		System.out.println("Circle area: " + circle2.getArea());
		System.out.println("Circle circumference: " + circle2.getCircumference());

		System.out.println("\n\nHw7 OOP1 ==================");
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(5, 8);
		System.out.println(rectangle);
		System.out.println("Rectangle area: " + rectangle.getArea());
		System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
		System.out.println(rectangle2);
		System.out.println("Rectangle area: " + rectangle2.getArea());
		System.out.println("Rectangle perimeter: " + rectangle2.getPerimeter());

		System.out.println("\n\nHw8 OOP1 ==================");
		Employee employee = new Employee(1, "John", "Doe", 10000);
		System.out.println(employee);
		System.out.println("Annual Salary: " + employee.getAnnualSalary());
		System.out.println("Raise Salary from " + employee.getSalary() + " to: " + employee.raiseSalary(50));

		System.out.println("\n\nHw1 OOP2 ==================");
		MovableCircle moveableCircle = new MovableCircle(1, 1, 5, 5, 8);
		System.out.println(moveableCircle);
		moveableCircle.moveDown();
		System.out.println(moveableCircle);
		System.out.println("\n\nHw2 OOP2 ==================");
		MovableRectangle movableRectangle = new MovableRectangle(1, 1, 2, 2, 6, 6);
		System.out.println(movableRectangle);
		movableRectangle.moveLeft();
		System.out.println(movableRectangle);

		System.out.println("\n\nHw3 OOP2 ==================");
		DiscountRate discountRate = new DiscountRate();
		System.out.println("Premium Service Discount Rate: " + discountRate.getServiceDiscountRate("Premium"));
		System.out.println("Gold Service Discount Rate: " + discountRate.getServiceDiscountRate("Gold"));
		System.out.println("Silver Service Discount Rate: " + discountRate.getServiceDiscountRate("Silver"));

		Visit visitPremium = new Visit("PK", null);
		visitPremium.getCustomer().setMember(true);
		visitPremium.getCustomer().setMemberType("Premium");
		visitPremium.setServiceExpense(150);
		visitPremium.setProductExpense(100);
		System.out.println(visitPremium);
		System.out.println("Total Expense: " + visitPremium.getTotalExpense());

		Visit visitGold = new Visit("Time", null);
		visitGold.getCustomer().setMember(true);
		visitGold.getCustomer().setMemberType("Gold");
		visitGold.setServiceExpense(150);
		visitGold.setProductExpense(100);
		System.out.println(visitGold);
		System.out.println("Total Expense: " + visitGold.getTotalExpense());

		Visit visitSilver = new Visit("KP", null);
		visitSilver.getCustomer().setMember(true);
		visitSilver.getCustomer().setMemberType("Silver");
		visitSilver.setServiceExpense(150);
		visitSilver.setProductExpense(100);
		System.out.println(visitSilver);
		System.out.println("Total Expense: " + visitSilver.getTotalExpense());

		Visit visiter = new Visit("emiT", null);
		visiter.setServiceExpense(150);
		visiter.setProductExpense(100);
		System.out.println(visiter);
		System.out.println("Total Expense: " + visiter.getTotalExpense());

	}
}
