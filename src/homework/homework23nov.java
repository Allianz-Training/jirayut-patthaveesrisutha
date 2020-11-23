package homework;

import java.util.Scanner;

public class homework23nov {
	public static void main(String[] args) {
		int n = 4;

		lineSeperator("1.1");
		draw1(n);

		lineSeperator("1.2");
		draw2(n);

		lineSeperator("1.3");
		draw3(n);

		lineSeperator("1.4");
		draw4(n);

		lineSeperator("1.5");
		draw5(n);

		lineSeperator("1.6");
		draw6(n);

		lineSeperator("1.7");
		draw7(n);

		lineSeperator("1.8");
		draw8(n);

		lineSeperator("2");
		String[][] table = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		multiplyTable(table);

		lineSeperator("3.1");
		draw9(n);

		lineSeperator("3.2");
		draw10(n);

		lineSeperator("3.3");
		draw11(n);

		lineSeperator("3.4");
		draw12(n);

		lineSeperator("3.5");
		draw13(n);

		lineSeperator("3.6");
		draw14(n);

		lineSeperator("3.7");
		draw15(n);

		lineSeperator("3.8");
		draw16(n);

		lineSeperator("3.9");
		draw17(n);

// HW4 KEYBOARD MOVE TO THE LAST ONE

		lineSeperator("5.1");
		draw18(n);

		lineSeperator("5.2");
		draw19(n);

		lineSeperator("5.3");
		draw20(n);

		lineSeperator("5.4");
		draw21(n);

		lineSeperator("5.5");
		draw22(n);
		
		lineSeperator("5.6");
		draw23(n);
		
		lineSeperator("5.7");
		draw24(n);
		
		lineSeperator("5.8");
		draw25(n);
//		lineSeperator("Keyboard");
//		Scanner scan = new java.util.Scanner(System.in);
//		System.out.print("Please enter number: ");
//		keyboard(scan.nextInt());
	}

	public static void draw1(int n) {
		System.out.println("*".repeat(n));
	}

	public static void draw2(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*".repeat(n));
		}
	}

	public static void draw3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void draw4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void draw5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

	public static void draw6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(n - i);
			}
			System.out.println();
		}
	}

	public static void draw7(int n) {
		for (int i = 1; i <= n * n; i++) {
			System.out.print(i);
			if (i % n == 0) {
				System.out.println();
			}
		}
	}

	public static void draw8(int n) {
		for (int i = n * n; i >= 1;) {
			for (int j = 0; j < n; j++, i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void multiplyTable(String[][] table) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				table[i][j] = String.valueOf(Integer.parseInt(table[i][j]) * 2);
				System.out.print(table[i][j]);
				if (j == 2) {
					continue;
				}
				System.out.print(", ");
			}
			System.out.println();
		}
	}

	public static void draw9(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println((i - 1) * 2);
		}
	}

	public static void draw10(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i * 2);
		}
	}

	public static void draw11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i * j);
			}
			System.out.println();
		}
	}

	public static void draw12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void draw13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - (i - 1)) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void draw14(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > i) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void draw15(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > n - i + 1) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void draw16(int n) {
		boolean isN = false;
		for (int i = 1; i != 0;) {
			System.out.println("*".repeat(i) + "_".repeat(n - i));
			if (i == n) {
				isN = true;
			}
			if (isN) {
				i--;
			} else {
				i++;
			}
		}
	}

	public static void draw17(int n) {
		boolean isN = false;
		for (int i = 1; i != 0;) {
			System.out.println(String.valueOf(i).repeat(i) + "_".repeat(n - i));
			if (i == n) {
				isN = true;
			}
			if (isN) {
				i--;
			} else {
				i++;
			}
		}
	}

	public static void keyboard(int n) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(n + " x " + String.valueOf(i) + " = " + (n * i));
		}
	}

	public static void draw18(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void draw19(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > i - 1) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}

	public static void draw20(int n) {
		boolean isN = false;
		for (int i = 1; i != 0;) {
			System.out.println("_".repeat(n - i) + "*".repeat(i));
			if (i == n) {
				isN = true;
			}
			if (isN) {
				i--;
			} else {
				i++;
			}
		}
	}

	public static void draw21(int n) {
		boolean isN = false;
		int i = 1;
		for (int j = 1; j != 0;) {
			System.out.print("_".repeat(n - j));
			for (int k = 1; k <= j; k++) {
				System.out.print(i);
				i++;
			}
			System.out.println();
			if (j == n) {
				isN = true;
			}
			if (isN) {
				j--;
			} else {
				j++;
			}
		}

	}

	public static void draw22(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("_".repeat(n - i));
			System.out.print("*".repeat(i * 2 - 1));
			System.out.print("_".repeat(n - i));
			System.out.println();
		}
	}
	
	public static void draw23(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("_".repeat(i-1));
			System.out.print("*".repeat((n*2)-1-((i-1)*2)));
			System.out.print("_".repeat(i-1));
			System.out.println();
		}
	}
	
	public static void draw24(int n) {
		boolean isN = false;
		for(int i = 1 ; i != 0;) {
			printUnderScore(n-i);
			System.out.print("*".repeat((2*i)-1));
			printUnderScore(n-i);
			if (i == n) {
				isN = true;
			}
			
			if (isN) {
				i--;
			} else {
				i++;
			}
			System.out.println();
		}
	}
	
	public static void draw25(int n) {
		boolean isN = false;
		int count = 1;
		for(int i = 1 ; i != 0;) {
			printUnderScore(n-i);
			for(int j = 1 ; j <= (2*i)-1; j++) {
				System.out.print(count);
				count++;
			}
			printUnderScore(n-i);
			if (i == n) {
				isN = true;
			}
			
			if (isN) {
				i--;
			} else {
				i++;
			}
			System.out.println();
		}
	}
	
	public static void printUnderScore(int i) {
		System.out.print("_".repeat(i));
	}
	
	

	public static void lineSeperator(String q) {
		System.out.println();
		System.out.println(q + "=======================================");
		System.out.println();
	}
}
