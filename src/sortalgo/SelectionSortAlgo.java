package sortalgo;

public class SelectionSortAlgo {

	public static void main(String[] args) {
		// Selection sort
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = intArray.length-1;
				lastUnsortedIndex >0; lastUnsortedIndex-- ) {
			int largestNumberIndex = 0;
			for(int i=1; i<= lastUnsortedIndex; i++){
				if(intArray[largestNumberIndex] < intArray[i]) {
					largestNumberIndex = i;
				} 
			}
			
			swap(intArray, lastUnsortedIndex, largestNumberIndex);
		}
		
		System.out.println("Selection Sorted Array: ");
		for(int element: intArray) {
			System.out.println(element);
		}
		
	}
	
	public static void swap(int[] arr, int lastUnsortedIndex, int largestNumberIndex) {
		if(arr[largestNumberIndex] == arr[lastUnsortedIndex]) {
			return;
		}
		
		int temp = arr[lastUnsortedIndex];
		arr[lastUnsortedIndex] = arr[largestNumberIndex];
		arr[largestNumberIndex] = temp;
		
	}


}
