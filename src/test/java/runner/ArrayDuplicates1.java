package runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates1 {

public static void findDuplicates(int[] a){

	int duplicates[] = new int[a.length];
	int count =0;
	for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j])
			{
				int k;
				for(k=0;k<count;k++)
				if(duplicates[k]==a[i])
					break;
				if(count==k)
					duplicates[count++]=a[i];
			  	break;
			}
	}
		
	}duplicates = Arrays.copyOf(duplicates,count);
		System.out.println(Arrays.toString(duplicates));
	 	
	
	
	
}
public static void main(String[] args) {
	findDuplicates(new int[] {5,8,9,0,6,5,4,73,2,8,9,1,0,7,6});
	findDuplicatesSet(new int[] {5,8,9,0,6,5,4,73,2,8,9,1,0,7,6});
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(5);
	list1.add(4);
	list1.add(0);
	List<Integer> list2 = new ArrayList<Integer>();
	list2.add(5);
	list2.add(0);
	list2.add(4);
	Collections.sort(list1);
	Collections.sort(list2);
	System.out.println(compareList(list1, list2));
	
}
private static Boolean compareList(List<Integer> list1, List<Integer> list2) {
	//return 	Arrays.equals(list1.toArray(), list2.toArray());
	return list1.equals(list2);
}
private static void findDuplicatesSet(int[] a) {
	Set<Integer> set = new LinkedHashSet<	>();
	for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j])
			{
				set.add(a[i]);
			  	break;
			}
	}
	}
	System.out.println(set);
	
	}
}
