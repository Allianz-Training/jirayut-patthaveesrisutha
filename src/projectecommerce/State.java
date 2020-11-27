package projectecommerce;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class State {
	// static variable single_instance of type Singleton
	private static State single_instance = null;

	private ShoppingCart cart = new ShoppingCart();
	private Stack<Page> stack = new Stack<>();
	private ArrayList<Product> products = new ArrayList<>();

	private boolean isAdmin = true;
	Scanner scanner = new Scanner(System.in);
	

	// private constructor restricted to this class itself
	private State() {
	}

	// static method to create instance of Singleton class
	public static State getInstance() {
		if (single_instance == null)
			single_instance = new State();

		return single_instance;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public Stack<Page> getStack() {
		return stack;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
}