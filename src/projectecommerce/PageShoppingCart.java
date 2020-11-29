package projectecommerce;

import java.util.Iterator;
import java.util.Map;

public class PageShoppingCart extends Page {

	State state = State.getInstance();

	@Override
	public void show() {
		boolean isRemove = false;
		System.out.println("=====Shopping Cart=====");
		state.getCart().showShoppingCartList();
		System.out.println();
		System.out.println("Type Product ID to remove from the cart.");
		System.out.println("Type C to clear cart.");
		System.out.println("Type CO to checkout");
		System.out.println("Type B to Back");
		System.out.print("Please Input: ");

		String inputString = state.scanner.nextLine();

		switch (inputString.toLowerCase()) {
		case "b": {
			state.getStack().pop().show();
			break;
		}
		case "c":{
			state.getCart().clearCart();
			show();
			break;
		}
		case "co":{
			PageCheckOut page = new PageCheckOut();
			page.show();
			state.getStack().push(this);
			break;
		}
		default:
			for (Product p : state.getCart().getProducts()) {
				if (p.getId().equals(inputString)) {
					System.out.println("Removed " + p.getTitle() + " from cart");
					state.getCart().removeProduct(p);
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
