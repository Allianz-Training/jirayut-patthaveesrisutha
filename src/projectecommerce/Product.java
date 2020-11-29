package projectecommerce;

public class Product {
	private final String id;
	private String title;
	private int price;
	
	public Product(String id, String title, int price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
