package BinarySearch;

public class TryOut_1 {
	 public static int search(int arrayOfElements[], int elementToBeSearched)  { 
	        int low = 0;
	        int high = arrayOfElements.length -1 ;
	        int mid;
	        while (low <= high) { 
	            mid = (low + high)/2;
	            
	            //Checking if the element is present in the mid position
	            if (arrayOfElements[mid] == elementToBeSearched) 
	                return mid; 
	            
	            // If the element is greater than the element in the mid position, 
	            // low is updated
	            if (arrayOfElements[mid] < elementToBeSearched) 
	            	low = mid+1;
	         
	            // Else high is updated
	            else
	            	high = mid - 1;
	        } 
	        
	        //-1 is being returned when the element is not present in the array 
	        return -1; 
	    } 
	    
		public static void main(String[] args) { 
	        int[] arrayOfElements = {10,15,23,25,32,39,45,47,49,50}; 
	        int elementToBeSearched  = 15; 

	        int index = search(arrayOfElements, elementToBeSearched); 
	        if (index == -1) 
	            System.out.println("Element is not present in the array"); 
	        else
	            System.out.println("Element found at position : " + index); 
	    } 

}
