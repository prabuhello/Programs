package runner;

public class Numbers {

	public static int reverseNumber(int num){
		int tem =num;
		if(tem <0)
			num*=-1;
		int rev=0;
		while(num>0){
			rev = rev*10+num%10 ;
			num/=10;
	}
		if(tem<0)
			rev*=-1;
		return rev;
		}
	
	public static void main(String[] args) {
	System.out.println(reverseNumber(-1));
	}

}
