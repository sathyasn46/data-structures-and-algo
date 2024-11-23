package arraysandbigo;

public class S2DataStructure {

	public static void main(String[] args) {

		/*
		 * Now the big O notation is a way of expressing the complexity related to the number of items that an algorithm has to deal with.
		 * And it's written as a capital O followed by an expression in parenthesis.
		 */
		
		
		/*
		 * Big-O O(1)	 Constant 
		 * O(logn) 		 Logarithmic 
		 * O(n) 		 Linear 
		 * O(nlogn) 	 nlog-star n
		 * O(n^2) 		 Quadratic
		 */
		
		int[] intArray = new int[7];
		
		intArray[0] =20;
		intArray[1] =35;
		intArray[2] =-15;
		intArray[3] =7;
		intArray[4] =55;
		intArray[5] =1;
		intArray[6] =-22;
		
		for(int i=0; i< intArray.length; i++) {
			System.out.println(intArray[i]);
		} 
	}

}
