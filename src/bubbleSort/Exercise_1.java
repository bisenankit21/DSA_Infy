package bubbleSort;

public class Exercise_1 {
	static int noOfSwaps = 0;
	static int noOfPasses = 0;

	public static void swap(int[] elements, int firstIndex, int secondIndex) {
		// Implement your logic here
		if(elements[firstIndex]>elements[secondIndex]) {
			int temp=elements[secondIndex];
			elements[secondIndex]=elements[firstIndex];
			elements[firstIndex]=temp;
			noOfSwaps++;
		}
	}

	public static int bubbleSort(int[] elements) {
		// Implement your logic here and change the return statement accordingly
		for(int i=0;i<elements.length-1;i++) {
			boolean swapped = false;
			noOfPasses += 1;
			for(int j=0;j<elements.length-i-1;j++) {
				
				if(elements[j]>=elements[j+1]) {
					swap(elements, j, j+1);
					swapped=true;
				}
			}
			if(swapped==false) {
				break;
			}
			//displayArray(elements);
		}
		return noOfPasses;
	}

	public static void displayArray(int[] elements) {
		for (int element : elements)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] elements = { 23, 67, 45, 76, 34, 68, 90 };

		System.out.println("Given array:");
		displayArray(elements);

		int noOfPasses = bubbleSort(elements);

		System.out.println("==========================");
		System.out.println("Total number of passes needed to sort the array: " + noOfPasses);
		System.out.println("==========================");

		System.out.println("Array after sorting:");
		displayArray(elements);

	}

}
