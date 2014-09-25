package org.avg.ds.queue;

import org.avg.ds.common.POJO;

public class DSQueue {
	
	private int size;
	
	private int frontPos;
	private int rearPos;
	private int noOfNodes;
	
	private POJO[] data;
	
	public DSQueue(){
		this.size = 10;
		this.noOfNodes = 0;
		this.frontPos=0;
		this.rearPos=0;
		data = new POJO[size];
	}
	
	public boolean enqueue(POJO pojo){
		
		if(noOfNodes==size){
			System.out.println("Queue is full");
			return false;
		}
		noOfNodes++;
		data[rearPos] = pojo.deepCopy();
		rearPos = (rearPos+1)%size;
		
		return true;
	}
	
	public POJO dequeue(){
		if(noOfNodes==0){
			return null;
		}
		
		int curfront = frontPos;
		frontPos = (frontPos+1)%size;
		noOfNodes--;
		return data[curfront];
		
	}
	
	public void showAll(){
		int i = frontPos;
		System.out.println("Front position:"+frontPos+"; rearPos:"+rearPos+"; noOfNodes:"+noOfNodes);
		for(int c = 1; c<=noOfNodes;c++){
			System.out.print(data[i].toString()+" ; ");
			i = (i+1)%size;
		}
		System.out.println("");
	}
	
	
	public static void main(String args[]){
		DSQueue q = new DSQueue();
		
		for(int i=0;i<=10;i++){
			q.enqueue(new POJO(""+i,""+i));
		}
		q.showAll();
		
		System.out.println("First dequeue : "+q.dequeue().toString());
		q.showAll();
		q.enqueue(new POJO("11","11"));
		
		q.enqueue(new POJO("12","12"));
		q.showAll();
		
	}
	
	

}
