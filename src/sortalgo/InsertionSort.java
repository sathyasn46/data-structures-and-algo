package sortalgo;

public class InsertionSort {

	public static void main(String[] args) {
		// InsertionSort
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int firstUnsortedIndex = 1 ; firstUnsortedIndex < intArray.length ; firstUnsortedIndex++ ) {
			int newElement = intArray[firstUnsortedIndex];
			int i;
			for( i=firstUnsortedIndex; i>0 && intArray[i-1]> newElement ; i--) {
				intArray[i]= intArray[i-1];
			}
			
			intArray[i] = newElement;
		}
		
		System.out.println("Insertion Sorted Array: ");
		for(int element: intArray) {
			System.out.println(element);
		}

	}

}
