package lab25nov;

public class Product implements IProductFrontPage {
	public String price,title,URLImage,soldText;
	
	public Product(String price, String title, String URLImage, String soldText) {
		this.price = price;
		this.title = title;
		this.URLImage = URLImage;
		this.soldText = soldText;
	}

	@Override
	public String getPrice() {
		return price;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getURLImage() {
		return URLImage;
	}

	@Override
	public String getSoldText() {
		return soldText;
	}
}
