package lab;

import java.util.HashMap;
import java.util.Map;

public class lab24nov {
	public static void main(String[] args) {

		question("String from char[]");
		labString();

		question("Lab 12");
		lab12();

		question("Lab 13");
		lab13();
		
		String[] strs = {"flower","flower","flower","flower"};
		System.out.println(longestCommonPrefix(strs));

	}
	
	public static String longestCommonPrefix(String[] strs) {
	       if(strs.length == 1){
	           return strs[0];
	       } else{
	            boolean pass = false;
	        String checkString = "";
	        for(int i = strs[0].length() ; i > 0 ; i--) {
			    if(strs[0].length() < 1){
	                break;
	            }         
	            checkString = strs[0].substring(0,i);

				for (int j = 1 ; j < strs.length ; j++) {
					if(i > strs[j].length()) {
	                    pass = false;
						break;
					}else {
						if(!checkString.equals(strs[j].substring(0,i))) {
	                        pass = false;
							break;
						}else{
	                        pass = true;
	                    }
							
					}
				}
	            if(pass){
	                return checkString;
	            }
	            
			}
	        return "";
	       }

	    }


	public static void labString() {
		char[] myChar = { 'T', 'i', 'm', 'e' };
		String myWordString = new String(myChar);
		System.out.println(myWordString);
	}

	public static void lab12() {
		String string1 = "You and Me";
		String string2 = " you and me ";

		System.out.println("No1");
		if (string1.equals(string2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		System.out.println("\nNo2");
		if (string1.contains("you")) {
			System.out.println("Have \"you\" in: " + string1);
		} else {
			System.out.println("Not have \"you\" in: " + string1);
		}

		if (string2.contains("you")) {
			System.out.println("Have \"you\" in: " + string2);
		} else {
			System.out.println("Not have \"you\" in: " + string2);
		}

		System.out.println("\nNo3");
		System.out.println(string1 + " length: " + string1.length());
		System.out.println(string2 + " length: " + string2.length());

		System.out.println("\nNo4");
		System.out.println(string1.substring(4));
		System.out.println(string2.substring(4));

		System.out.println("\nNo5");
		System.out.println(string2.trim());

		System.out.println("\nNo6");
		System.out.println(string1.toUpperCase());
		System.out.println(string2.toUpperCase());

		System.out.println("\nNo7");
		System.out.println(string2.trim().toUpperCase());
	}

	public static void lab13() {
		int[][] myIntArray = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

		System.out.println("No1");
		for (int[] row : myIntArray) {
			for (int element : row) {
				System.out.print(element + " ");

			}
		}
		System.out.println();

		System.out.println("\nNo2");
		int sum = 0;
		for (int[] row : myIntArray) {
			sum += row[row.length - 1];
		}
		System.out.println("Total sum of last index each row is: " + sum);
	}

	public static void question(String q) {
		System.out.println();
		System.out.println(q + " =======================================");
		System.out.println();
	}
}
