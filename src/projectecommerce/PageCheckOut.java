package projectecommerce;

import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.text.SimpleDateFormat;
import java.util.Date;

public class PageCheckOut extends Page {

	State state = State.getInstance();

	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd+HH+mm+ss");
	Date date = new Date(System.currentTimeMillis());
	String inpuString;

	@Override
	public void show() {
		System.out.println("=====CheckOut=====");
		state.getCart().showShoppingCartList();
		System.out.println("==================");
		System.out.println("Total :" + state.getCart().getTotalPrice() + " Baht");
		System.out.println();
		System.out.println("Type CO to confirm for shipping.");
		System.out.println("Type B to Back");
		System.out.print("Please Input: ");

		inpuString = state.scanner.nextLine();

		switch (inpuString.toLowerCase()) {
		case "co": {
			createTextFile();
			break;
		}
		case "b": {
			state.getStack().pop().show();
			break;
		}
		default:
			System.out.println("Invalid Input!");
			show();
			break;
		}
	}

	private void createTextFile() {
		String filepath = formatter.format(date) + ".txt";
//		String filepath = "C:\\Users\\jirayutpat\\Desktop\\address\\" + filename;
//		String filepath = "C:\\Users\\jiray\\Desktop\\address\\" + filename;

		System.out.println("================");
		System.out.println("Please type your address: ");

		try {
			File myObj = new File(filepath);
			myObj.createNewFile();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try {
			inpuString = state.scanner.nextLine();

			FileWriter myWriter = new FileWriter(filepath);
			myWriter.write(inpuString);
			myWriter.close();
			System.out.println("Thank you! Your order will be shipped ASAP");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
