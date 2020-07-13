package Trees;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.xml.soap.Node;

public class TreeOperations {

	node root;
	
	class node{
		int value;
		node left;
		node right;

		 node(int value){
			this.value= value;
			left= null;
			right=null;
			//root = null;
		}
	}
	
	
	public TreeOperations() {
	 this.root =null;
	}
	
	public void add(int value){
		root = addRecursive(root,  value);
	}
	
	private node addRecursive(node current, int value) {
		
		if(current == null){
			return new node(value);
		} 
		
		if(current.value < value){
			current.right= addRecursive(current.right, value);
		} else if(current.value >value){
			current.left = addRecursive(current.left, value);
		} else{
			return current;
		}
		return current;
	}
	
	
	
	
	
	
	public boolean containsNode(int value){
		
		return containsNodeRecursive(root, value);
	}

	
	private boolean containsNodeRecursive(node current, int value) {
		
		if(current == null){
			return false;
		}
		
		if(value==current.value){
			return true;
		}
		return value < current.value ? containsNodeRecursive(current.left,value): containsNodeRecursive(current.right, value);
	}
	
	public void delete(int value){
		root = deleteRecursive(root, value);
	}
	
	private node deleteRecursive(node current, int value) {
		if(current == null){
			return null;
		}	
		
		// real code to delete
		
		if(value == current.value){
		
			//case 1 no children
			
			if(current.left==null && current.right ==null){
				return null;
			}
			
			// one children
			if(current.right ==null){
				return current.left;
			}
			if(current.left ==null){
				return current.right;
			}
			
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;	
		}
		
		if(value <current.value){
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		
		current.right = deleteRecursive(current.right, value);
		return current;
	}

	private int findSmallestValue(node right) {
		 return right.left == null? right.value:findSmallestValue(right.left);
	}

	private void traverseInOrder(node node){
		if(node!=null){
			traverseInOrder(node.left);
			System.out.println(" " + node.value);
			traverseInOrder(node.right);
		}
	}
	
	
	
	public void traverseInOrder(){
		traverseInOrder(root);
	}
	
	private void traversePreOrder(node node){
		if(node!=null){
			System.out.println(" " + node.value);
			traverseInOrder(node.left);
			traverseInOrder(node.right);
		}
	}
	
	public void traversePreOrder(){
	     traversePreOrder(root);
	}
	
	private void traversePostOrder(node node){
		if(node!=null){
			traverseInOrder(node.left);
			traverseInOrder(node.right);
			System.out.println(" " + node.value);
		}
	}
	
	public void traversePostOrder(){
		traversePostOrder(root);
	}

	
	
	//Breadth First Search
	public void traverseLevelOrder(){
	
		if(root == null){
			return;
		}
		
		Queue<node> nodes = new LinkedList<>();
		nodes.add(root);
		
		while(!nodes.isEmpty()){
			node node = nodes.remove();
			System.out.println(node.value + " ");

			if(node.left!=null){
				nodes.add(node.left);
			}
			
			if(node.right!=null){
				nodes.add(node.right);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		TreeOperations t = new TreeOperations();
		t.add(6);
		t.add(4);
		t.add(8);
		t.add(3);
		t.add(5);
		t.add(7);
		t.add(9);
		//t.add(4);
		//t.add(7);
		//t.add(120);
		
		System.out.println(t.containsNode(5));
		t.traverseInOrder();
		t.delete(5);
         System.out.println("########################");
     	t.traverseInOrder();
  

		//t.traversePreOrder();
		  System.out.println("########################");
		//t.traversePostOrder();
		  
	     	t.traverseLevelOrder();
	}

}
