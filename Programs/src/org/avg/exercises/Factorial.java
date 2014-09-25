package org.avg.exercises;


/**
 * Finds the factorial of a given number recursively
 *
 */
public class Factorial {
	
	public static long nFactorial(long n){
		if(n==0) {
			return 1;
		}
		return n * nFactorial(n-1);
	}
	
	public static void main(String args[]){
		for(long i=1; i<=10;i++){
			System.out.println("Factorial of "+i+" = "+Factorial.nFactorial(i));
		}
	}
	
}
