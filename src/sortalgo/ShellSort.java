package sortalgo;

public class ShellSort {

	public static void main(String[] args) {
		// Shell sort
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int gap=intArray.length/2 ; gap > 0 ; gap /= 2 ) {
			for(int i=gap; i< intArray.length; i++) {
				int newElement = intArray[i];
				int j=i;
				
				//Now shift elements by comparing with a gap distance
				while(j >=gap && (intArray[j-gap] > newElement)) {
					intArray[j]= intArray[j-gap];
					j -= gap;
				}
				
				intArray[j]= newElement;
			}
			
		}
		
		System.out.println("Insertion Sorted Array: ");
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
