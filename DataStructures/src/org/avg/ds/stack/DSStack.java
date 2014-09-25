package org.avg.ds.stack;

import org.avg.ds.common.POJO;

public class DSStack {

	private int size;
	private int topPos;
	
	private POJO[] data;
	
	public DSStack(){
		this.size = 10;
		topPos = -1;
		data = new POJO[size];
	}
	
	public DSStack(int size){
		this.size = size;
		topPos = -1;
		data = new POJO[size];
	}
	
	public int push(POJO pojo){
		if(topPos == size-1){
			System.out.println("The stack is full.");
			return -1;
		}
		
		topPos++;
		data[topPos] = pojo.deepCopy();
		return 0;
	}
	
	public POJO pop(){
		if(topPos<=0){
			System.out.println("The stack is empty.");
			return null;
		}
		int curtop = topPos;
		topPos = topPos -1;
		return data[curtop];
	}
	
	public void showAll(){
		for(int i=topPos; i>=0; i--){
			System.out.println(data[i].toString());
		}
	}

	
	public static void main(String args[]){
		DSStack stack = new DSStack();
		stack.push(new POJO("1", "One"));
		stack.showAll();
		System.out.println("");

		stack.push(new POJO("2", "Two"));
		stack.showAll();
		System.out.println("");
		
		
		stack.pop();
		stack.showAll();
		System.out.println("");
		
		
		stack.push(new POJO("3", "Three"));
		stack.showAll();
		System.out.println("");
		stack.pop();
		stack.showAll();
		System.out.println("");
		stack.pop();
		stack.showAll();
		System.out.println("");
		stack.pop();
		stack.showAll();
		System.out.println("");
		stack.push(new POJO("4", "Four"));
		stack.showAll();
		System.out.println("");
		stack.push(new POJO("5", "Five"));
		stack.showAll();
		System.out.println("");
		stack.push(new POJO("6", "Six"));
		stack.showAll();
		System.out.println("");
		stack.push(new POJO("7", "Seven"));
		stack.showAll();
		System.out.println("");
		
	}
	
}
