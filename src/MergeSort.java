
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
		
	}
	
	public static int[] mergeList(int numbersLeftSide[], int numbersRightSide[]) {
		
		int newList[] = {0};
		return newList;
	}
}
