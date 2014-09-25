package org.avg.ds.lists;

import org.avg.ds.common.Node;

public class SinglyLinkedList<T> {

	private Node<T> head;
	
	public SinglyLinkedList(){
		head = new Node<T>();
		head.data = null;
		head.next = null;
	}
	
	public boolean insertAtHead(T insertNode){
		
		if(head==null) return false;
		
		Node<T> newNode = new Node<T>();
		
		newNode.next = head.next;
		head.next = newNode;
		newNode.data = insertNode;
		return true;
	}
	
	public void showAll(){
		Node<T> current = head;
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	/************************************************
	 * 
	 * DELETE A NODE FROM THE SINGLY LINKED LIST
	 * 
	 ************************************************/
	public void delete(Integer value){

		Node<T> curNode = head;
		
		while( curNode.next !=null ){
		
			if( curNode.next.data == value ){
				curNode.next = curNode.next.next;
			}
			
			curNode = curNode.next;
		}
	}
	
	/************************************************
	 * 
	 * REVERSE A SINGLY LINKED LIST
	 * 
	 ************************************************/
	public void reverse(){
		Node<T> reversedPart = null;
		Node<T> current = head;
		
		while(current!=null){
			Node<T> next = current.next;
			current.next = reversedPart;
			reversedPart = current;
			current = next;
		}
		head = reversedPart;		
	}
	
	
	public void middleElement(){
		
		Node<T> current = head;
		Node<T> middle = head;
		
		int length = 0;
		
		while ( current.next!=null){
		
			length ++;
			
			if( length%2 == 0 ){
				middle = middle.next;
			}
			current = current.next;
		}
		
		if(length%2==1){
			middle = middle.next;
		}
		
		System.out.println("middle value = "+middle.data);
	}
	
	
	
	public static void main(String args[]){
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		sll.insertAtHead(1);
		sll.insertAtHead(20);
		sll.insertAtHead(45);
		sll.insertAtHead(2);
		sll.insertAtHead(5);
//		sll.delete(45);
		//sll.reverse();
		sll.showAll();
		sll.middleElement();
	}
	
}
