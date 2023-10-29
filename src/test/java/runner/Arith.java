package runner;

public class Arith {
public static void main(String[] args) {
	
	int a=10;
	for(int i=0;i<20;i++) {
		System.out.println(i);
		try {
		System.out.println(9/0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
