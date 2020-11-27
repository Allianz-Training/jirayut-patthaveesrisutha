package projectecommerce;

import java.util.Iterator;
import java.util.Map;

public class PageShoppingCart extends Page {

	State state = State.getInstance();

	@Override
	public void show() {
		boolean isRemove = false;
		System.out.println("=====Shopping Cart=====");
		state.cart.showShoppingCartList();
		System.out.println();
		System.out.println("Type Product ID to remove from the cart.");
		System.out.println("Type C to clear cart.");
		System.out.println("Type CO to checkout");
		System.out.println("Type B to Back");
		System.out.print("Please Input: ");

		String inpuString = state.scanner.nextLine();

		switch (inpuString.toLowerCase()) {
		case "b": {
			state.stack.pop().show();
			break;
		}
		case "c":{
			state.cart.clearCart();
			show();
			break;
		}
		case "co":{
			PageCheckOut page = new PageCheckOut();
			page.show();
			state.stack.push(this);
			break;
		}
		default:
			for (Product p : state.cart.getProducts()) {
				if (p.getId().equals(inpuString)) {
					System.out.println("Removed " + p.getTitle() + " from cart");
					state.cart.removeProduct(p);
					isRemove = true;
					break;
				}
			}
			if(!isRemove) {
				System.out.println("Invalid Input");
			}
			show();
			break;
		}
	}

}
