package lab25nov;

public class ProductCosmetic extends Product {
	public String suitableSkinColor;

	public ProductCosmetic(String price, String title, String URLImage, String soldText) {
		super(price, title, URLImage, soldText);
	}
	
	public ProductCosmetic(String price, String title, String URLImage, String soldText,String suitableSkinColor) {
		super(price, title, URLImage, soldText);
		this.suitableSkinColor = suitableSkinColor;
	}
}
