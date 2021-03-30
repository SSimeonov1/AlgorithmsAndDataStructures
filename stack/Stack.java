package stack;

public class Stack {

	int[] stack;
	int top;
	
	
	public Stack(int sizeOfArray) {
		stack = new int[sizeOfArray];
		top = 0;
	}
	
	
	public boolean isEmpty() {
		boolean answer = false;
		if(top <= 0) {
			answer = true;
		}
		return answer;
	}
	
	
	public int peek() {
		int data = 0;
		if(!isEmpty()) {
			data = stack[top - 1];
		}
		return data;
	}
	
	
	public void push(int data) {
		stack[top] = data;
		top++;
	}
	
	
	public int pop() {
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
	}
	
	
}
