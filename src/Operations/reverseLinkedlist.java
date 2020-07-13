package Operations;

import java.util.HashSet;
import java.util.LinkedList;



public class reverseLinkedlist {
	
	node sorted;
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
	
	public void reverseList(reverseLinkedlist list){
		node prev= null;
		node next = null;
		node current = list.head;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev=current;	
			current = next;
				
		}
		 list.head=prev;
	}
	
	
	public  boolean detectLoop(node n) {
		
		HashSet<node> s = new HashSet<node>();
		while(n!=null){
			if(s.contains(n))
				return true;
			s.add(n);
			n=n.next;
		}
		return false;
	}
	
	public static void main(String[] args) {

		reverseLinkedlist ls = new reverseLinkedlist();
		ls.push(50);
		ls.push(200);
		ls.push(50);
		ls.push(20);
		ls.push(30);
		ls.head.next.next.next.next = ls.head; 
//		ls.push(60);
//		ls.push(54);
//		ls.push(62);
//		ls.push(320);
//		ls.push(300);
//		ls.push(54);
		//ls.print(ls.head);
		System.out.println(ls.detectLoop(ls.head));
		//ls.reverseList(ls);
		//ls.print(ls.head);																																																							}

}
}
