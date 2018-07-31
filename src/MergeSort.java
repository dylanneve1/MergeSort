
public class MergeSort {

	static int numbers[] = {5, 3, 7, 6, 9, 1, 2, 7};
	
	public static void main(String[] args) {
		mSort(numbers);
	}

	public static void mSort(int numbers[]) {
		if(numbers.length == 1) {
			System.exit(0);
		}
	}
}
