package lab25nov;


public class MainProduct {
	public static void main(String[] args) {
		IProductFrontPage[] products = new IProductFrontPage[5];
		products[0] = new Product("30000", "iPhone12", "", "10");
		products[1] = new Course("10000", "Java 101", "", "Time", 100, 5);
		products[2] = new ProductCosmetic("1200", "Toner", "", "67","Some Color");
		products[3] = new Course("10000", "Java 102", "", "Time", 100, 5);
		products[4] = new Course("10000", "Java 103", "", "Time", 100, 5);
		
		for (IProductFrontPage p : products) {
			System.out.println("Title: " + p.getTitle());
		}
	}
}
