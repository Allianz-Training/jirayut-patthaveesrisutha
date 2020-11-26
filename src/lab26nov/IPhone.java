package lab26nov;

import lab26nov.Brand.BRAND;

public final class  IPhone extends Phone {

	private final String assistance = "Siri";
	
	public IPhone() {
		super.brand = BRAND.Apple;
	}
	
	@Override
	public void voiceAssistance() {
		System.out.println("My assistance is " + assistance);
	}	
}
