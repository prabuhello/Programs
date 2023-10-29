package runner;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
	public static void main(String[] args) {
		for(int i=1;i<1000000;i++) {
			List<Integer> a= new ArrayList<>();
		if(isPerfect(i, a))
			System.out.println(i +" = "+a);
		}
	}
	

private static boolean isPerfect(int num, List<Integer> a) {
		int sum=0;
		for(int i=1; i<=num/2; i++) {
			if(num%i==0) {
				sum+=i;
				a.add(i);
				}
		}
		return sum==num;
	}
}
