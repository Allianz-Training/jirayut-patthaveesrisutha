package projectecommerce;

public class Main {
	public static void main(String[] args) {
		
		State state = State.getInstance();
		
		
		Product p1 = new ElectronicProduct("01", "TV", 4000);
		Product p2 = new FoodProduct("02", "test", 50);
		
		state.products.add(p1);
		state.products.add(p2);
	

		PageMain mainPage = new PageMain();
		mainPage.show();
//		System.out.println("Total Price: " + state.cart.getTotalPrice());
	}
}
