package org.avg.exercises.basic;

public class Hanoi {

	
	public static void hanoi(int n, int from, int other, int to){
		
		if(n==0){
			System.out.println("Move 1 ring from tower " + from + " to tower" + to);
			return;
		}
		
		hanoi(n-1, from, to, other);
		
		System.out.println("Move 1 ring from tower " + from + " to tower " + to);
		
		hanoi(n-1, other, from, to);
		
	}
	
	public static void main(String argsp[]){
		Hanoi.hanoi(3, 1, 2, 3);
	}
}
