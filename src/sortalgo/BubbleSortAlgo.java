package sortalgo;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		// Bubble sort Time complexity- O(n^2)
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = intArray.length-1; 
				lastUnsortedIndex >0; lastUnsortedIndex--) {
			for(int i=0; i<lastUnsortedIndex ;i++ ) {
				if(intArray[i] > intArray[i+1]) {
					swap( intArray, i, i+1);
				}
			}
			
		}
		
		System.out.println("Bubble Sorted Array: ");
		for(int element: intArray) {
			System.out.println(element);
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}


}
