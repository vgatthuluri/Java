package org.avg.ds.sorting;


// Binary Search Tree (BST)

public class BinarySearchTree {

	private Node<Integer> root;
	
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(45);
		bst.insert(10);
		bst.insert(400);
		bst.insert(2);
		bst.insert(125);
		bst.insert(5);
		bst.insert(300);
		System.out.println("Min value = "+bst.findMin());
		System.out.println("Max value = "+bst.findMax());
		bst.printInOrder();
		bst.printPreOrder();
		bst.printPostOrder();
	}
	
	
	/***********************************************************
	 *  INSERT
	 ***********************************************************/
	
	public void insert(int value){
		Node<Integer> curNode = new Node<Integer>(value);
		if(root==null){
			root = curNode;
			return;
		}
		insertNode(root, curNode);
	}

	private void insertNode(Node<Integer> lastRoot, Node<Integer> curNode) {
		if(lastRoot.data > curNode.data){
			//left
			if(lastRoot.left==null){
				//leaf node
				lastRoot.left = curNode;
				return;
			}else{
				insertNode(lastRoot.left, curNode);
			}
		} else {
			//right
			if(lastRoot.right == null){
				lastRoot.right = curNode;
				return;
			}else{
				insertNode(lastRoot.right, curNode);
			}
		}
	}
	
	/***********************************************************
	 *  IN-ORDER, PRE-ORDER and POST-ORDER Traversal
	 ***********************************************************/
	
	public void printPostOrder(){
		System.out.println("\nPostOrder:");
		printPostOrderValues(root);
	}
	
	public void printPostOrderValues(Node<Integer> curNode){
		if(curNode==null) return;
		
		printPostOrderValues(curNode.left);
		printPostOrderValues(curNode.right);
		System.out.print(curNode.data+",");
	}
	
	public void printInOrder(){
		System.out.println("In Order:");
		printInOrderNodeValues(root);
	}
	
	public void printInOrderNodeValues(Node<Integer> curNode){
		if(curNode==null) return;
		
		printInOrderNodeValues(curNode.left);
		System.out.print(curNode.data+",");
		printInOrderNodeValues(curNode.right);
	}
	public void printPreOrder(){
		System.out.println("\nPreOrder:");
		printPreOrderValues(root);
	}
	
	public void printPreOrderValues(Node<Integer> curNode){
		if(curNode==null) return;
		System.out.print(curNode.data+",");
		printPreOrderValues(curNode.left);
		printPreOrderValues(curNode.right);
	}
	
	
	/***********************************************************
	 *  Find MINIMUM and MAXIMUM value in a Binary Tree
	 ***********************************************************/
	public int findMax(){
		if(root==null) return 0;
		
		Node<Integer> curNode = root;
		
		while(curNode.right!=null){
			curNode = curNode.right;
		}
		return curNode.data;
	}
	
	public int findMin(){
		if(root==null) return 0;
		
		Node<Integer> curNode = root;
		
		while(curNode.left!=null){
			curNode = curNode.left;
		}
		return curNode.data;
	}
	
	
	
	
	
	
	
}
