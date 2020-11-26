package lab26nov;

public abstract class Phone {
	protected Brand.BRAND brand;
	
	public abstract void voiceAssistance();
	
	public final void call() {
		System.out.println("Calling");
	}

	public Brand.BRAND getBrand() {
		return brand;
	}

	public void setBrand(Brand.BRAND brand) {
		this.brand = brand;
	}
	
	
}
