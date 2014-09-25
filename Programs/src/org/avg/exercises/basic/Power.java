package org.avg.exercises.basic;

public class Power {

	
	/**
	 * Recursive steps
	 * 1. code for base case - basically, exit criteria
	 * 2. code for reduced problem
	 * 3. generate the general solution
	 * 4. return the general solution.
	 * @param x
	 * @param n
	 * @return
	 */
	
	
	public static double xPowerN(double x, long n){
		
		//base case
		if(n==0) return 1;
		
		//reduced problem
		double rp = xPowerN(x, n-1);
		
		//general solution
		double gs = x * rp;
		
		//return the gs
		return gs;
		
	}
	
	public static void main(String args[]){
		for(int i=0;i<=10;i++){
			System.out.println("2 to the power of "+i+" = "+Power.xPowerN(2, i));
		}
	}
}
