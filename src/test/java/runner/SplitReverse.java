package runner;

public class SplitReverse {

	private static String reverseSentence(String given) {
		
		String[] split = given.split(" ");
		String output="";
		for (String str : split) {
			output= str +" "+output;
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseSentence("My  daughters       are very    naughty girle!"));
		System.out.println(removeDuplicates("My  daughters       are very    naughty girle!"));
		
	}

	private static String removeDuplicates(String string) {
		
		char[] charArray = string.toCharArray();
		
		for(int i=0;i<string.length();i++) {
			if(string.indexOf(string.charAt(i)) != string.lastIndexOf(string.charAt(i))) {
				string = string.replaceAll(""+string.charAt(i), "");
			}
		}
		
		
			
		
		
		return string;
	}
}
