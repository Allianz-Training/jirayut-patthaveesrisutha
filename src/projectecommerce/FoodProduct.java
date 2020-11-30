package projectecommerce;

import java.sql.Date;

public class FoodProduct extends Product {

	private Date expDate;

	public FoodProduct(String id, String title, int price) {
		super(id, title, price);
	}
}
