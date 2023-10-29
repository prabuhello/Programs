package runner;

public class CountWord {
public static void main(String[] args) {
	String str ="mayu how are you mayu mayu mayu mayu ?";
	int length = str.length();
	 int length2 = str.replaceAll("mayu","").length();
	int len=  length - length2;
	System.out.println(len/4);
;
}
}
