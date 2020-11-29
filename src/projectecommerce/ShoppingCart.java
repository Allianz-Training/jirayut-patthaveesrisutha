package projectecommerce;

import java.util.*;

public class ShoppingCart {

	LinkedHashMap<Product, Integer> cart = new LinkedHashMap<>();

	public void addProduct(Product p) {
		if (cart.containsKey(p)) {
			cart.put(p, cart.get(p) + 1);
		} else {
			cart.put(p, 1);
		}
	}

	public void removeProduct(Product p) {
		if (cart.get(p) > 1) {
			cart.put(p, cart.get(p) - 1);
		} else {
			cart.remove(p);
		}
	}
	
	public void clearCart() {
		cart.clear();
	}

	public int getTotalPrice() {
		int total = 0;
		Iterator iterator = cart.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			Product product = (Product) me.getKey();
			total += product.getPrice() * (int) me.getValue();
		}
		return total;
	}
	
	public void showShoppingCartList() {
		Iterator iterator = cart.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			Product product = (Product) me.getKey();
			System.out.println("ID: " + product.getId() + ", Title: "+ product.getTitle() + ", Price: " + product.getPrice());
			System.out.println("Amount: " + me.getValue());
		}
	}
	
	public Set<Product> getProducts() {
		return cart.keySet();
	}
	

	
	

	@Override
	public String toString() {
		return "ShoppingCart [cart=" + cart + "]";
	}

}
