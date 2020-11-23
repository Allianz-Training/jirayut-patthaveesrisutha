package lab;

public class lab23nov {

	public static void main(String[] args) {
//		int myInt = 10;
//		boolean myBool = true;
//		String myString = "Time";
//
//		System.out.println("This is my Int : " + myInt);
//		System.out.println("This is my Bool : " + myBool);
//		System.out.println("This is my String : " + myString);
//
//		bark();
//
//		float myFloat = 2.5f;
//		double myDouble = 2.5000d;
//		char myChar = 'a';
//
//		int myNewInt = (int) myFloat;
//		float myNewFloat = myInt;
//		float myNewFloat2 = (float) myDouble;
//		int myNewInt2 = myChar;
//
//		System.out.println(myNewInt);
//		System.out.println(myNewFloat);
//		System.out.println(myNewFloat2);
//		System.out.println(myNewInt2);
//
//		final String hello = "Hello";
//
//		int tryAdd = 20;
//		int trySub = 20;
//		for (int i = 0; i < 5; i++) {
//			tryAdd++;
//			--trySub;
//		}
//
//		System.out.println(tryAdd);
//		System.out.println(trySub);

		question("Lab4");
		// Lab4
		int score = 70;
		boolean isHandsome = true;
		lab4(score, isHandsome);

		question("Lab4 Optional No1");
		int waterUnit = 10;
		lab4Optionaln1(waterUnit);
		question("Lab4 Optional No2");
		lab4Optionaln2();

		question("Lab5");
		lab5(score);

		question("Lab6 No1");
		lab6n1();

		question("Lab6 No2");
		lab6n2();

		question("Lab6 No3");
		lab6n3();

		question("Lab6 No4");
		lab6n4();

		question("Lab8");
		lab8();

		question("Lab 9");
		lab9();

		question("Lab 10");
		lab10();

		question("Lab 11 no return method");
		double side = 10;
		lab11NoReturn(side);

		question("Lab 11 with return method");
		double area = lab11WithReturn(side);
		System.out.println("Calculate in main// Area is " + area);

	}

	public static void lab4(int score, boolean isHandsome) {
		if (score >= 80 || isHandsome) {
			System.out.println("Good");
		} else if (score >= 50 && score < 80) {
			System.out.println("normal");
		} else if (score < 50) {
			System.out.println("fail");
		}
	}

	public static void lab4Optionaln1(int waterUnit) {
		double rate = 0;
		if (waterUnit > 0 && waterUnit <= 50) {
			rate = 4.25;
		} else if (waterUnit > 50 && waterUnit <= 100) {
			rate = 3.25;
		} else if (waterUnit > 100) {
			rate = 2.25;
		}
		System.out.println("Water bill is " + ((double) waterUnit * rate) + " Baht");

	}

	public static void lab4Optionaln2() {
		int productPower = 2000;
		int year = 0;
		while (productPower < 5000) {
			productPower += 365;
			year++;
		}
		System.out.println(year + " Years to product > 5000/year");
	}

	public static void lab5(int score) {
		String grade = "";
		switch (score) {
		case 80:
			grade = "A";
			break;
		case 70:
			grade = "B";
			break;
		case 60:
			grade = "C";
			break;
		case 50:
			grade = "D";
			break;
		case 40:
			grade = "F";
			break;

		default:
			grade = "E";
			break;
		}

		System.out.println("Grade is " + grade);

	}

	public static void lab6n1() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}

	public static void lab6n2() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("Result 1 - 10 is " + sum);
	}

	public static void lab6n3() {
		int i = 1;
		while (i < 100) {
			if (i % 12 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}

	public static void lab6n4() {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void lab8() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println("break at: " + count);
				break;
			}
			System.out.println("something to show that its not break");
		}
	}

	public static void lab9() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println(count);
				continue;
			}
			System.out.println("not continue at count: " + count);
		}
	}

	public static void lab10() {
		for (int i = 1; i <= 10; i++) {
			if (i == 2) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void lab11NoReturn(double side) {
		System.out.println("From inside method");
		System.out.println("Area of Square is " + (side * side));
	}

	public static double lab11WithReturn(double side) {
		return side * side;
	}

	public static void bark() {
		String dogName = "Dang";

		System.out.println(dogName + " bark");
	}

	public static void question(String q) {
		System.out.println();
		System.out.println(q + " =======================================");
		System.out.println();
	}

}
