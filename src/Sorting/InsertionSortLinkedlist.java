package Sorting;

public class InsertionSortLinkedlist {
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
	public void insertionSort(node headref){
		sorted = null;
		node current = headref;
		while(current!=null){
			node next = current.next;
			sortedInsert(current);
			current = next;			
		}
		head = sorted;
		
		
	}
	
	public void sortedInsert(node newnode){
		
		if(sorted== null || sorted.val >= newnode.val){
			newnode.next = sorted;
			sorted= newnode;
		} else {
			node current = sorted;
			while(current.next!= null && current.next.val< newnode.val){
				current= current.next;
			}
			
			newnode.next= current.next;
			current.next = newnode;
				
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
		InsertionSortLinkedlist ls = new InsertionSortLinkedlist();
		ls.push(50);
		ls.push(60);
		ls.push(54);
		ls.push(62);
		ls.push(320);
		ls.push(300);
		ls.print(ls.head);
		ls.insertionSort(ls.head);
		ls.print(ls.head);

	}

}
