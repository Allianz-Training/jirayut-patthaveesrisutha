package projectecommerce;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class State {
	// static variable single_instance of type Singleton
	private static State single_instance = null;

	// variable of type String
	public String s;
	public ShoppingCart cart = new ShoppingCart();
	public Stack<Page> stack = new Stack<>();
	public ArrayList<Product> products = new ArrayList<>();
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
}