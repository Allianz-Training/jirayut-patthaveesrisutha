package projectecommerce;

import java.util.Scanner;

public class MainPage extends Page {

	State state = State.getInstance();

	@Override
	public void show() {
		System.out.println("What you want to do?");
		System.out.println("type a Show Product List");
		System.out.println("type b Manage Product List");
		System.out.println("type Q to QUIT");

		System.out.print("Please Input: ");
		
		Scanner scanner = new Scanner(System.in);
		String inpuString = scanner.nextLine();
		
		while(!inpuString.toLowerCase().equals("q")) {
			switch (inpuString) {
			case "a": {
				System.out.println("Go to Show Product List");
				break;
			}
			default:
				System.out.print("Invalid Value Try again!: ");
				inpuString = scanner.nextLine();
			}
		}
	}

}
