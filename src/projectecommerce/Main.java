package projectecommerce;

public class Main {
	public static void main(String[] args) {
		
		State state = State.getInstance();
		
		
		Product p1 = new ElectronicProduct("001", "TV", 4000);
		Product p2 = new FoodProduct("002", "Cheese", 50);
		Product p3 = new Product("003", "Wood", 200);
		
		state.getpList().addProduct(p1);
		state.getpList().addProduct(p2);
		state.getpList().addProduct(p3);

		PageMain mainPage = new PageMain();
		mainPage.show();
//		System.out.println("Total Price: " + state.cart.getTotalPrice());
	}
}
