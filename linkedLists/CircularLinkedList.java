package linkedLists;

public class CircularLinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		Node tempNode = head;
		
		if(head == null) {
			head = node;
		}
		else {
		    tempNode = head;
		
		while(tempNode.next != head && tempNode.next != null) {
			tempNode = tempNode.next;
		}
		node.prev = tempNode;
		node.next = head;
		tempNode.next = node;
		head.prev = node;
		}	
	}
	
	
	public void print() { 
		Node node = head;
		
		if(node == null) {
			System.out.println("The list is empty");
		}
		else {
			do {
				System.out.println(node.data);
				node = node.next;
			} while(node != head);
		}
		
	}
	
	
	public void deleteHead() {
		if(head.prev != null) {
			head.prev.next = head.next;
		}
		if(head.next != null) {
			head.next.prev = head.prev;
			head = head.next;
		}
		if(head.next == null && head.prev == null) {
			System.out.println("The list is empty!");
			return;
		}
	}
	
	
	public void deleteTail() {
		Node node = head;
		
		while(node != null && node.next != head && node.next != null) {
			node = node.next;
		}
		if(node == head) {
			deleteHead();
			return;
		}
		head.prev = node.prev;
		node.prev.next = head;
	}
	
	
	public void search(int data) {
		Node node = head;
		boolean flag = false;
		
		if(head == null) {
			System.out.println("The list is empty");
		}
		else {
			do {
				if(node.data == data) {
					flag = true;
					break;
				}
				node = node.next;
			} while(node != head);
			if(flag) {
				System.out.println(flag);
			}
			else {
				System.out.println("Element not found");
			}
		}
	}

	
	public void delete(int data) {
		Node node = head;
		
		if(node == null) {
			System.out.println("The list is empty");
			return;
		}
		
		while(node.next != null) {
			if(node.data == data) {
				if(node == head) {
					head = node.prev;
				}
				node.prev.next = node.next;
				node.next.prev = node.prev;
				return;
			}
			node = node.next;
		}
	}
}
