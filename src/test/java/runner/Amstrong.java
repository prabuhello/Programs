package runner;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println(isAmstrong(0));
		System.out.println(isAmstrong(407));
		System.out.println(isAmstrong(153));
		System.out.println(isAmstrong(370));
		System.out.println(isAmstrong(371));
		int count =0;
		for(int i=0;i<=100000;i++) {
			if(isAmstrong(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Amstrong number is "+count);
	}

	
	private static boolean isAmstrong(int num) {
		return num == findAmstrong(num, countDigit(num));
	}

	private static int findAmstrong(int num, int countDigit) {
		int sum=0;
		do {
			 sum += Math.pow(num%10,countDigit);
			num/=10;
		}while(num>0);
		return sum;
	}

	private static int countDigit(int num) {
		int tDigit =0;
		if(num==0)return 1;
		while(num>0) {
			tDigit++;
				num/=10;
		}
		return tDigit;
	}
	
}
