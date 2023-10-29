package runner;

public class Fibbonocci {

	
	public static void main(String[] args) {
		fib(10);
	}

	private static void fib(int n) {
		int first= -1,second=1;
		for(int i=0;i<10;i++) {
			int third = first+ second;
			System.out.print(third+" ");
			first = second;
			second=third;

		}
	}
}
