package demo1.util;

public class MyQueue {
	
	int[] elements;
	public MyQueue() {
		elements = new int[0];
		// TODO Auto-generated constructor stub
	}
	//进队列
	public void add(int element) {
		int[] newArr =new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	//出队列
	public int poll() {
		int element = elements[0];
		int[] newArr = new int[elements.length-1];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] =elements[i+1];
		}
		elements = newArr;
		return element;
	}
	
	
	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.add(9);
		mq.add(8);
		mq.add(7);
		System.out.println(mq.poll());
	}
		
	
		
}