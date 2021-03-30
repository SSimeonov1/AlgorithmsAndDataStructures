package linkedLists;

public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		
	}
	
	
public  void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}


public void insertAt(int index, int data) {
	Node node = new Node ();
	node.data = data;
	node.next = null;
	
	Node n = head;
	
	for(int i = 0; i < index - 1; i++) {
		n = n.next;
	}
	node.next = n.next;
	n.next = node;
	
}


public void delete(int index) {
	if(index == 0) {
		head = head.next;
	}
	else {
		Node n = head;
		Node n1 = null;
		
		for(int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;
	}
}


public void deleteHead() {
	head = head.next;
	print();
}


public void deleteTail() {
	Node node = head;
	
	while(node.next.next != null) {
		node = node.next;
	}
	node.next = null;
	print();
}


public void clear() {
	head = null;
}


public void getFirst() {
	Node node = head;
	
	while(node.next != null) {
		System.out.println(node.data);
		break;
	}
}


public void getLast() {
	Node node = head;
	
	while(node != null) {
		node = node.next;
		
		if(node.next == null) {
			System.out.println(node.data);
			break;
		}
	}
	
	
}


public void search(int data) {
	Node node = head;
	boolean flag = false;
	
	if(node == null) {
		System.out.println("List is Empty");
	}
	else {
		while(node != null) {
			if(node.data == data) {
				flag = true;
				break;
			}
			node = node.next;
		}
	}
	if(flag) {
		System.out.println(flag);
	}
	else {
		System.out.println("Element not found");
	}

	
}
	

	public void print() {
		Node node = head;
		
		if(node == null) {
			System.out.println("The list is empty!");
		}
		else {
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
		}
	}
	
	
	public void getSize() {
		Node node = head;
		int count = 0;
		
		while(node != null) {
			node = node.next;
			count++;
		}
		System.out.println(count); 
	}
}
