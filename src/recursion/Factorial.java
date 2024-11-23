package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursiveFactorial(4));
	}
	
	
	private static int recursiveFactorial(int num) {
		
		//recursion breaking condition _ also called the base case
		if(num == 0) {
			return 1;
		}
		
		int factorial = num * recursiveFactorial(num-1); 
		
		return factorial;
	}
	
	public static int iterativefactorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		int factorial =1;
		for(int i=1; i<=num; i++) {
			factorial = factorial * i; 
		}
		
		return factorial;
	}

}
