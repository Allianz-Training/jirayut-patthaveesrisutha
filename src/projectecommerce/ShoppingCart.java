package projectecommerce;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCart {

	HashMap<Product, Integer> cart = new HashMap<>();

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

	@Override
	public String toString() {
		return "ShoppingCart [cart=" + cart + "]";
	}

}
