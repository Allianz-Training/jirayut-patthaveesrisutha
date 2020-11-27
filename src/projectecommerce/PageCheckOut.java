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

	@Override
	public void show() {
		System.out.println("=====CheckOut=====");
		System.out.println("Total :" + state.cart.getTotalPrice() + " Baht");
		System.out.println();
		System.out.println("Type CO to confirm for shipping.");
		System.out.println("Type B to Back");
		System.out.print("Please Input: ");

		String inpuString = state.scanner.nextLine();

		switch (inpuString.toLowerCase()) {
		case "co": {
			String filename = formatter.format(date) + ".txt";
			String filepath = "C:\\Users\\jirayutpat\\Desktop\\address\\" + filename;

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
			break;
		}
		case "b": {
			state.stack.pop().show();
			break;
		}
		default:
			System.out.println("Invalid Input!");
			show();
			break;
		}
	}

}
