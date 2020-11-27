package projectecommerce;

import java.util.Scanner;

public class PageMain extends Page {

	State state = State.getInstance();

	@Override
	public void show() {
		System.out.println("What you want to do?");
		System.out.println("type a to Show Product List");
		System.out.println("type b to Manage Product List");
		System.out.println("type Q to QUIT");

		System.out.print("Please Input: ");

		String inpuString = state.scanner.nextLine();

		switch (inpuString.toLowerCase()) {
		case "a": {
			state.stack.push(this);
			PageProductList page = new PageProductList();
			page.show();
			break;
		}
		case "q": {
			System.out.println("Good Bye");
			break;
		}
		default:
			System.out.println("Invalid Input!");
			show();
			break;
		}

	}

}
