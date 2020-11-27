package projectecommerce;

import java.net.InetSocketAddress;

public class PageProductList extends Page {
	State state = State.getInstance();
	
	@Override
	public void show() {

		boolean isAdd = false;

		System.out.println("=====Product List=====");
		for (Product p : state.getProducts()) {
			System.out.println(p);
		}
		System.out.println();
		System.out.println("Type Product ID to add to the cart.");
		System.out.println("Type SC to go to cart");
		System.out.println("Type B to Back");
		System.out.print("Please Input: ");

		String inpuString = state.scanner.nextLine();

		switch (inpuString.toLowerCase()) {

		case "b": {
			state.getStack().pop().show();
			break;
		}
		case "sc": {
			PageShoppingCart page = new PageShoppingCart();
			state.getStack().push(this);
			page.show();
			break;
		}
		default:
			for (Product p : state.getProducts()) {
				if (p.getId().equals(inpuString)) {
					System.out.println("Added " + p.getTitle() + " to cart");
					state.getCart().addProduct(p);
					isAdd = true;
					break;
				}
			}
			if(!isAdd) {
				System.out.println("Invalid Input!");
			}
			show();
			break;
		}
	}

}
