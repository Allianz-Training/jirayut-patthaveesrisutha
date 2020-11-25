package hw25nov;

public class Circle {
	private double radius = 1.0;
	private String colorString = "red";

	public Circle() {

	}

	public Circle(Double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "Circle[radius=" + radius + "]";
	}

}
