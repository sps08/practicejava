package Operations;

import java.util.HashSet;

public class removeDuplicate {


	node head;
	class node{
		int val;
		node next;

		private node(int val){
			this.val = val;
		}
	}

	public void push(int val){	
		node newnode = new node(val);
		newnode.next = head;
		head = newnode;
	}
	
	public void removeDuplicate(node head){
		
		HashSet<Integer> hset = new HashSet<>();
		
		node prev = null;
		node current = head;
		while(current!=null){
			
			if(hset.contains(current.val)){
				prev.next= current.next;
				
			}else{
				prev= current;
				hset.add(current.val);
			}
			current = current.next;
		}
	}

	public void print(node head){
		System.out.println("#######  PRINT  ###########");
		while(head!=null){
			System.out.println(head.val);
			head= head.next;
		}
	}

	public static void main(String[] args) {
		removeDuplicate rd = new removeDuplicate();
		rd.push(20);
		rd.push(30);
		rd.push(40);
		rd.push(20);
		rd.push(70);
		rd.push(90);
		rd.push(90);
		rd.push(90);
		rd.push(10);
		rd.print(rd.head);
		rd.removeDuplicate(rd.head);
		rd.print(rd.head);

	}

}
