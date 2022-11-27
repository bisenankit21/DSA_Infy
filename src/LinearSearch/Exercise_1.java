package LinearSearch;

public class Exercise_1 {
	public static int searchElement(int[] elements, int elementToBeSearched) {
		//Implement your logic here and change the return statement accordingly
		int count=0;
		for(int index=0;index<elements.length;index++) {
			count++;
			if(elements[index]==elementToBeSearched) {
				return count;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] elements = { 76, 24, 78, 98, 1 };
		int elementToBeSearched = 78;
		
		int numberOfIterations = searchElement(elements, elementToBeSearched);
		
		if (numberOfIterations == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations);
	}

}
