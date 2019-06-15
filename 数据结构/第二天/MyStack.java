package demo1.util;


import java.util.Arrays;
//栈
//先进后出

public class MyStack {
	int[] elements;
	
	public MyStack() {
		elements = new int[0];		
		// TODO Auto-generated constructor stub
	}
	public void push(int element) {
		int[] newArr =new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	public int pop() {
		if (elements.length==0) {
			throw new RuntimeException("stack is null");
		}
		int element = elements[elements.length-1];
		int[] newArr = new int[elements.length-1];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = elements[i];
		}
		elements = newArr;
		return element;
		
	}
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	public int peek() {
		return elements[elements.length-1];
	}
	public boolean isEmpty() {
		return elements.length==0;
	}
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(15);
		ms.push(9);
		ms.push(10);
		ms.show();
		System.out.println(ms.pop());
		ms.show();
		System.out.println(ms.peek());
		System.out.println(ms.isEmpty());
		
	}
	
}
