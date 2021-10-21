package com.stackandqueue;

public class StackMain {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
		// To perform peak and pop till the list is empty
		stack.peak();
		stack.pop();
		stack.display();
		stack.peak();
		stack.pop();
		stack.display();
		stack.peak();
		stack.pop();
		stack.display();

	}
}