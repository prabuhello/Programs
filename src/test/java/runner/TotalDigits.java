package runner;

public class TotalDigits {
	
	public static boolean  isAmstrong(int num){
		int tem = num;
		int ams = 0;
		if(num < 0)
			return false;
		int totalDigits = findDigits(num);
		while(num>0){
		    ams += Math.pow(num%10,totalDigits);
		    num/=10;
		}
		  return tem ==ams ? true : false;
		}



		private static  int findDigits(int num){
			int count =0;
			do{
			 count++;
			num/=10;
			}while(num>0);
			System.out.println("Total Digits : "+count);
			return count;
		}

public static void main(String[] args) {
	System.out.println(isAmstrong(153));
	
	System.out.println(isAmstrong(-1));
	System.out.println(isAmstrong(0));

}
}
