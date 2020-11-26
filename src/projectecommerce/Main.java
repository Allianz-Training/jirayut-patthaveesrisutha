package projectecommerce;

public class Main {
	public static void main(String[] args) {
		
		State state = State.getInstance();
		
		
		Product p1 = new ElectronicProduct("01", "TV", 4000);
		Product p2 = new FoodProduct("02", "test", 50);
		
		state.cart.addProduct(p1);
		state.cart.addProduct(p1);
		state.cart.addProduct(p2);
		System.out.println(state.cart);

		MainPage mainPage = new MainPage();
		mainPage.show();
		System.out.println("Total Price: " + state.cart.getTotalPrice());
	}
}
