package lab26nov;

public class Main {
	public static void main(String[] args) {
		IPhone xIPhone = new IPhone();
		xIPhone.call();
		xIPhone.voiceAssistance();
		System.out.println(xIPhone.getBrand());
	}
}
