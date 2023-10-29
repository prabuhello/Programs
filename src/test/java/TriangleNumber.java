import java.util.List;

public class TriangleNumber {

	public static void main(String[] args) {
		System.out.println("Teaiangle");
		for(int i=5;i>0;i--) {
			String row="";
			for(int j=5;j>=i;j--)
				if(j==5)
					row=""+j;
				else	
				row =	j +" "+ row +" "+j;
			
			System.out.println(row);
			
			
		}
	}
}
