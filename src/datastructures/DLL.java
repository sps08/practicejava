package datastructures;

	public class DLL {
	
		Node head;	
		static class Node { 
			int data; 
			Node prev;
			Node next; 
	
			// Constructor 
			Node(int d) 
			{ 
				data = d; 
				prev = null;
				next = null; 
			} 
		} 
	
		public void push(int data){
			
			Node new_node = new Node(data);
			new_node.prev= null;
			new_node.next = head;
			if(head!=null){
				head.prev= new_node;
			}
			head = new_node;
		}
		
		public void InsertAfter(Node prev_node, int data){
			if(prev_node == null){
				System.out.println("Node Cannot be added as prev node is null");
				return;
			}
			Node new_node = new Node(data);
			new_node.next = prev_node.next;
			prev_node.next = new_node;
			new_node.prev = prev_node; 
			
			if(new_node.next != null){
				new_node.next.prev = new_node;
			}
		}
		
		public void append(int data){
			
			Node new_node = new Node(data);
			Node last = head;
			
			new_node.next = null;
			if(head == null){
				new_node.prev= null;
				head= new_node;
				return;
			}
			while(last.next!=null){
				last=last.next;
			}
			last.next = new_node;
			new_node.prev=last;		
		}
	
		 public void printlist(Node node) 
		    { 
		        Node last = null; 
		        System.out.println("Traversal in forward Direction"); 
		        while (node != null) { 
		            System.out.print(node.data + " "); 
		            last = node; 
		            node = node.next; 
		        } 
		        System.out.println(); 
		        System.out.println("Traversal in reverse direction"); 
		        while (last != null) { 
		            System.out.print(last.data + " "); 
		            last = last.prev; 
		        } 
		    } 
		 
		public static void main(String[] args) {
			 /* Start with the empty list */
	        DLL dll = new DLL(); 
	  
	        // Insert 6. So linked list becomes 6->NULL 
	        dll.append(6); 
	  
	        // Insert 7 at the beginning. So linked list becomes 7->6->NULL 
	        dll.push(7); 
	  
	        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL 
	        dll.push(1); 
	  
	        // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL 
	        dll.append(4); 
	  
	        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL 
	        dll.InsertAfter(dll.head.next, 8); 
	  
	        System.out.println("Created DLL is: "); 
	        dll.printlist(dll.head);
	}

}
