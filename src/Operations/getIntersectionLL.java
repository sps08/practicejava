package Operations;

import java.util.HashSet;

import datastructures.LinkedList;


public class getIntersectionLL {
	
	node head;
	class node{
		int val;
		node next;

		private  node(int val){
			this.val = val;
		}
	}

	public void push(int val){	
		node newnode = new node(val);
		newnode.next = head;
		head = newnode;
	}

	public void print(node head){
		System.out.println("#######  PRINT  ###########");
		while(head!=null){
			System.out.println(head.val);
			head= head.next;
		}
	}
	
	public node getIntersection(node head1, node head2){
		
		node n1 = head1;
		node n2 = head2;
		HashSet<Integer> hset = new HashSet<>();
		
		getIntersectionLL result = new getIntersectionLL();
		while(n1!=null){
			hset.add(n1.val);
			n1=n1.next;
		}
		
		while(n2!=null){
			if(hset.contains(n2.val)){
				result.push(n2.val);
			}
			n2= n2.next;
		}
		return result.head;
	}
	
	public static void main(String[] args) {
		getIntersectionLL ls = new getIntersectionLL();
	
		ls.push(50);
		ls.push(200);
		ls.push(150);
		ls.push(20);
		ls.push(30);
		
		getIntersectionLL ls2 = new getIntersectionLL();
		ls2.push(10);
		ls2.push(50);
		ls2.push(110);
		ls2.push(20);
		ls2.push(130);
		//ls.head.next.next.next.next = ls.head; 
//		ls.push(60);
		
		getIntersectionLL intersect = new getIntersectionLL();
		intersect.print(intersect.getIntersection(ls.head, ls2.head));
		
	

	}

}
