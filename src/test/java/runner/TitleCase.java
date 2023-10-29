package runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.text.WordUtils;

public class TitleCase {
	private static String findDuplicatesInArray(String[] inputStr) {
		List<String> listStr = new ArrayList<>(Arrays.asList(inputStr));
		System.out.println(listStr);
		for (int i=0;i<listStr.size();i++) {
			int count = 0;
			String str = listStr.get(i);
			do {
				listStr.remove(str);
				count++;
			}while(listStr.indexOf(str)!=-1);
			if(count>1) {
				System.out.println("Duplicate found : "+str );
				i--;
			}
		}
		
		System.err.println(listStr);
		return null;
	}
	public static void main(String[] args) {
		System.out.println( WordUtils.capitalize("i am fine"));
		System.out.println(WordUtils.uncapitalize("I AM a Good\tDD"));
		String[] inStr = new String[] {"ABC","BCD","CDF","ABC","ABC","BCD"};
		System.out.println(findDuplicatesInArray(inStr));
		System.out.println(Arrays.toString(inStr));
		List<Integer> ls = new ArrayList<>();
		testList(ls);
		System.out.println(ls);
	}
	private static void testList(List<Integer> ls) {
		ls.add(34);
	}
}
	 