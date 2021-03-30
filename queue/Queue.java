package queue;

public class Queue {

	
	int[] queue;
	int front;
	int rear;
	int size;
	
	
	   public Queue(int sizeOfArray) {
		queue = new int[sizeOfArray];
		rear = -1;
		front = -1;
		size = 0;
	}

	
	public boolean isEmpty() {
		boolean answer = false;
		if(size == 0) {
			answer = true;
		}
		return answer;
	}
	
	
	public boolean isFull() {
		boolean answer = false;
		if(rear == queue.length - 1) {
			answer = true;
		}
		else {
			answer = false;
		}
		return answer;
	}
	
	
	public int peek() {
		int answer = 0;
		if(!isEmpty()) {
			answer = queue[front + 1];
		}
		return answer;
	}
	
	
	public boolean enqueue(int element) {
		boolean answer = false;
		if(rear != queue.length - 1) {
			rear++;
			queue[rear] = element;
			size++;
			answer = true;
		}
		return answer;
	}
	
	
	public int dequeue() {
		int answer = 0;
		if(size != 0) {
			front++;
			answer = queue[front];
			size--;
		}
		return answer;
	}
	
	
	public int getSize() {
		return size;
	}
	
	
}
