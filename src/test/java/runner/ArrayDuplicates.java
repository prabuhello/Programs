package runner;

import java.util.Arrays;

public class ArrayDuplicates {
	public static void main(String[] args) {
		int a[] = { 18, 10, 10, 32, 23, 22, 2, 18, 9, 9, 44, 77, 77, 44, -9, 9 };
		int b[] = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count == 0)
				b[count++] = a[0];
			else {
				int j;
				for (j = 0; j < count; j++)
					if (a[i] == b[j])
						break;
				if (j == count) {
					b[count++] = a[i];
				}
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(Arrays.copyOf(b, count)));

		printDupliates();
	}

	public static void printDupliates() {
		int a[] = { 18, 10, 10, 32, 23, 22, 2, 18, 9, 9, 44, 77, 77, 44, -9, 9 };
		int b[] = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					int k;
					for (k = 0; k < count; k++)
						if (b[k] == a[i])
							break;
					if (count == k)
						b[count++] = a[i];
					break;
				}
			}

		}
		Arrays.sort(a);
		int[] copyOf = Arrays.copyOf(b, count);
		Arrays.sort(copyOf);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(copyOf));

	}

}
