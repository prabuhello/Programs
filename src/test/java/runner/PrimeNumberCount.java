package runner;

public class PrimeNumberCount {
	public static void main(String[] args) {
	

		System.out.println(isPrime(11));
		
	}

	private static Boolean[] isPrime(int i) {
		char c = '\u0000';
        String stringWithNull = "Hello\u0000";

        
        	System.out.println(stringWithNull);
        	System.out.println(stringWithNull.indexOf('\u0020'));
        	System.out.println(stringWithNull.trim().length());
		return null;
	}
}