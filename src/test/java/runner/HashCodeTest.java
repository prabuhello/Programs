package runner;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashCodeTest {

	public static void main(String[] args) {
		
		List<Integer> list= new LinkedList<Integer>();
		System.out.println(list.hashCode());
		list.add(1000);
		System.out.println(list.hashCode());
		list.add(4000);
		System.out.println(list.hashCode());
		
		List<Integer> list1= new LinkedList<Integer>();
		System.out.println(list1.hashCode());
		list1.add(1000);
		System.out.println(list1.hashCode());
		list1.add(4000);
		System.out.println(list1.hashCode());
		
		
		String str = new String("Mayusri");
		String str1 = new String("Mayusri");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		
		if(str1==str) {
			System.out.println("Equal");
		}
		
		/*
		 * Set<Integer> hs = new HashSet<Integer>();
		 * 
		 * hs.add(2); hs.add(20); hs.add(30);
		 * 
		 * for(Integer it : hs) { System.out.println(it+" "+it.hashCode()); }
		 */

	}
}
