import java.util.Arrays;

public class MergeSort {

	static int numbers[] = {5, 3, 7, 6, 9, 1, 2, 7};
	static int numbersLeftSide[];
	static int numbersRightSide[];
	
	public static void main(String[] args) {
		mSort(numbers);
	}

	public static int[] mSort(int numbers[]) {
		// If array is only 1 number exit because it is not possible to split.
		if(numbers.length == 1) {
			return numbers;
		}
		// TODO code rest of algorithm.
		splitList(numbers, numbersLeftSide, numbersRightSide);
		numbersLeftSide = mSort(numbersLeftSide);
		numbersRightSide = mSort(numbersRightSide);
		return mergeList(numbersLeftSide, numbersRightSide);
	}
	
	public static void splitList(int numbers[], int numbersLeftSide[], int numbersRightSide[]) {

		int n = numbers.length;

		int[] a = new int[(n + 1)/2];
		int[] b = new int[n - a.length];

		for (int i = 0; i < n; i++)
		{
			if (i < a.length)
				a[i] = numbers[i];
			else
				b[i - a.length] = numbers[i];
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	public static int[] mergeList(int numbersLeftSide[], int numbersRightSide[]) {
		
		int[]c = new int[numbersLeftSide.length + numbersRightSide.length];
		int count = 0;
		
		for(int i = 0; i < numbersLeftSide.length; i++) { 
			c[i] = numbersLeftSide[i];
	        count++;
	    } 
	    for(int j = 0;j < numbersRightSide.length;j++) { 
	        c[count++] = numbersRightSide[j];
	    } 
	    for(int i = 0; i < c.length;i++) System.out.print(c[i] + " ");
		return c;
	}
}
