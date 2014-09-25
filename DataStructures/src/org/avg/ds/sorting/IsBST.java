package org.avg.ds.sorting;

/**
 * 
 * Checks if the given binary tree is a BST or not.
 * 
 * 1. The LEFT sub-tree of a node contains only nodes with key value LESS than the node's key value
 * 2. The RIGHT sub-tree of a node contains only nodes with key value MORE than the node's key value
 * 3. Both LEFT and RIGHT sub-trees must also be binary trees.
 * 
 */
public class IsBST {

	public boolean isBST(Node<Integer> node){
		
		if(node == null) return true;
		
		if ( node.left !=null && maxData(node.left) > node.data){
			return false;
		}
		
		if( node.right != null && minData(node.right) < node.data) {
			return false;
		}
		
		//  false if, recursively, the left or right is not a BST
        if(!isBST(node.left) || !isBST(node.right))
        {
            return false;
        }
        
		return true;
	}

	private Integer minData(Node<Integer> node) {
		while(node.left!=null){
			node = node.left;
		}
		return node.data;
	}

	
	private Integer maxData(Node<Integer> left) {
		Node<Integer> node = left;
		while(node.right!=null){
			node = node.right;
		}
		return node.data;
	}
	
	
	public boolean isBSTNew(Node<Integer> node){
		
		return isBSTNew(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean isBSTNew(Node<Integer> node, int minValue, int maxValue){
		//  True is its a empty tree
        if(node == null)
        {
            return true;
        }
 
        //  False if this node violates the BST property
        if(node.data < minValue || node.data > maxValue)
        {
            return false;
        }
 
        //  Otherwise check the subtree recursively
        return (isBSTNew(node.left, minValue, node.data) && isBSTNew(node.right, node.data, maxValue));
    }
	
}
