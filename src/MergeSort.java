import java.util.Arrays;

public class MergeSort {

	static int numbers[] = {5, 3, 7, 6, 9, 1, 2, 7};
	static int numbersLeftSide[];
	static int numbersRightSide[];
	static int finalArray[];
	
	public static void main(String[] args) {
		System.out.println("Your array is : " + Arrays.toString(numbers) + "\n");
		finalArray = mSort(numbers);
		System.out.println("The final array is : " + Arrays.toString(finalArray));
	}

	public static int[] mSort(int numbers[]) {
		// If array is only 1 number exit because it is not possible to split.
		if(numbers.length == 1) {
			return numbers;
		}
		// TODO code rest of algorithm.
		numbersLeftSide = splitList(numbers, numbersLeftSide, numbersRightSide, true);
		numbersRightSide = splitList(numbers, numbersLeftSide, numbersRightSide, false);
		System.out.println("Done splitting");
		numbersLeftSide = mSort(numbersLeftSide);
		numbersRightSide = mSort(numbersRightSide);
		return mergeList(numbersLeftSide, numbersRightSide);
	}
	
	public static int[] splitList(int numbers[], int numbersLeftSide[], int numbersRightSide[], boolean left) {

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
		
		if(left) {
			return a;
		} else {
			return b;
		}
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
