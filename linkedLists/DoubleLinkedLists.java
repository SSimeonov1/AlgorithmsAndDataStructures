package linkedLists;

public class DoubleLinkedLists {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		
	    if(head == null) {
	    	head = node;
	    }
	    else {
	    	Node tempNode = head;
	    	
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		node.prev = tempNode;
		tempNode.next = node;
	    }
	}
	
	
	public void deleteHead() {
		head = head.next;
		head.prev = null;
	}
	
	
	public void print() {
		Node node = head;
		if(node == null) {
			System.out.println("The list is empty!");
		}
		else {
			node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
	
	
	public void delete(int data) {
		Node node = head;
		
		if(node == null) {
			System.out.println("The list is empty");
			return;
		}
		
		while(node != null) {
			if(node.data == data) {
				node.prev.next = node.next;
				node.next.prev = node.prev;
				return;
			}
			node = node.next;
		}
	}
	

}
