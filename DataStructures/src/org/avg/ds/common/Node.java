package org.avg.ds.common;

public class Node<T> {

	public T data;
	public Node<T> next;

	public Node(T data, Node<T> next){
		this.data = data;
		this.next = next;
	}
	
	public Node(){
		this.data =null;
		this.next = null;
	}
	
	public Node<T> deepCopy(){
		return new Node(this.data, this.next);
	}
}
