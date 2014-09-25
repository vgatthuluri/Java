package org.avg.exercises;

public class Fibonacci {

	
	public static long fibonacci(long n){
		
		// base cases
		if(n==0) return 0;

		if(n==1 || n==2) return 1;
		
		//reduced problem
		long rp1 = fibonacci(n-1);
		long rp2 = fibonacci(n-2);
		
		//general solution
		return rp1+rp2;
		
	}

	
	public static void main(String argsp[]){
		for( long i = 0 ; i <= 10 ; i ++ ){
			System.out.println("Fibonacci value of "+i+" = "+Fibonacci.fibonacci(i));
		}
	}
	
	
}
