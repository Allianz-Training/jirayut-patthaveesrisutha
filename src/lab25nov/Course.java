package lab25nov;

public class Course implements IProductFrontPage {
	public String price, title, URLImage, instructor;
	public int numTotal, numSold;
	
	public Course(String price, String title, String URLImage, String instructor, int numTotal, int numSold) {
		super();
		this.price = price;
		this.title = title;
		URLImage = URLImage;
		this.instructor = instructor;
		this.numTotal = numTotal;
		this.numSold = numSold;
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
		return numTotal + " " + numSold;
	}

	
	
}
