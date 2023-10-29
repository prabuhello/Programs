package runner;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		System.out.println(isSorting(new int[] {1,2,3,4,5,6,7,8,9}));
		System.out.println(isSorting(new int[] {81,72,63,54,45,36,27,18,9,}));
		System.out.println(isSorting(new int[] {1,1}));
		System.out.println(isSorting(new int[] {1,2,3,0,4,5,6,7,8,3}));
		System.out.println(isSorting(new int[] {}));
	}

	private static Boolean isSorting(int[] arr) {
		int asc[]= Arrays.copyOf(arr, arr.length);
		int[] des = Arrays.copyOf(arr, arr.length);;
		Arrays.sort(asc);
		Arrays.sort(des);
		des=reverse(des);
		return Arrays.equals(asc, arr) || Arrays.equals(des, arr);
	}

	private static int[] reverse(int[] des) {
		int rev[] = new int[des.length];
		int co=0;
		for (int i=des.length-1;i>=0;i--) {
			rev[co++] =des[i];
		}
		return rev;
	}
}
