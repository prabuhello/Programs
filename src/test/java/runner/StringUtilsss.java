package runner;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.text.WordUtils;
import org.bouncycastle.util.Arrays;


public class StringUtilsss {

	private static String swapCase(String swap) {

		String tem = "";
		System.out.println(swap);
		for (int i = 0; i < swap.length(); i++) {
			if (swap.charAt(i) >= 'a' && swap.charAt(i) <= 'z')
				tem += Character.toUpperCase(swap.charAt(i));
			else
				tem += Character.toLowerCase(swap.charAt(i));
		}
		return (tem);

		
	}

	public static void main(String[] args) {
		System.out.println(swapCase("Welcome To My WORld!"));
		System.out.println(countOfEachCharacter("Welcome To My WORld!\nrrr1234"));
		System.out.println(initialCpas("welcome to my             WORld!\nggg1234 887"));
		System.out.println(initialCpas1("welcome\t\tto\fmy             WORld!\nrrrr1234 887 \u0000dd"));
		System.out.print("welcome\t\tto\fmy             WORld!\nrrrr1234 887 \u0000dd =        ");
		System.out.println(countWord("welcome\t\tto\fmy             WORld!\nrrr\fr1234 887 \u0000dd"));
		System.out.println(findDuplicatesInArray(new String[] {"ABC","BCD","CDF","ABC","BCD"}));
		
	}

	private static String findDuplicatesInArray(String[] inputStr) {
		String[] append = Arrays.append(inputStr, "Mayusri");
		return null;
	}

	private static int countWord(String input) {
		
		        // Split the input string into words using regular expressions
		        String[] words = input.split("\\s+");

		        // Initialize a count for words
		        int wordCount = 0;
		        // Count the words
		        for (String word : words) {
		            // Check if the word contains at least one letter or digit
		            if (word.matches(".*[a-zA-Z0-9].*")) {
		                wordCount++;
		            }
		        }

		        return wordCount;
		    }
		
	
	
	private static String initialCpas1(String input) {
		System.out.println("Apache ======== "+WordUtils.capitalizeFully(input));
		boolean isFirstLetter = true; 
		int count =0;
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (i == 0 || isFirstLetter) {
				isFirstLetter = false;
				output = output + Character.toUpperCase(input.charAt(i));
				count++;
			}
			else
				output = output + Character.toLowerCase(input.charAt(i));
			if (Character.isWhitespace(input.charAt(i)) || input.charAt(i) =='\u0000')
				isFirstLetter = true;
		}
		System.out.println("Total words is "+count);
		return output;
	}

	private static String initialCpas(String input) {
		String[] given = input.split(" ");
		String output = "";
		for (String word : given) {
			if (word.length() > 0)
				output = output + Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			output += " ";
		}
		return output;
	}

	private static String countOfEachCharacter(String input) {
		int sC = 0, cC = 0, eC = 0, nC = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if ('a' <= c && 'z' >= c)
				sC++;
			else if ('A' <= c && 'Z' >= c)
				cC++;
			else if ('0' <= c && '9' >= c)
				nC++;
			else
				eC++;
		}
		return "Small=" + sC + "\nCapital=" + cC + "\nSpecial=" + eC + "\nNumber=" + nC;
	}
}
