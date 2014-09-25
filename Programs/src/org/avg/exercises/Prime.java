package org.avg.exercises;


public class Prime {


	public static boolean isPrime(int input){
		for(int i=2; i<input; i++){
			if( input%i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]){
		
		for(int i=0 ;  i<=20; i++){
			if(Prime.isPrime(i)){
				System.out.println(i);				
			}
		}
	}
}
