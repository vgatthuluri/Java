package org.avg.ds.sorting;

public class Node<T> {

	public T data;
	public Node<T> left;
	public Node<T> right;
	
	public Node(T value){
		this.data = value;
	}
}
