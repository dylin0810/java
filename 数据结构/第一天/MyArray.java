package demo1.util;

import java.util.Arrays;

import javax.lang.model.util.Elements;
import javax.management.RuntimeErrorException;

public class MyArray {
	//用于存储数据的数组
	private int[] elements;
	public MyArray() {
		// TODO Auto-generated constructor stub
		elements = new int[0];
	}
	//获取长度
	public int size() {
		return elements.length;
	}
	//末尾加入一个元素
	public void add(int element) {
		int[] newArr =new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	//打印所有元素到控制台
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	//删除某个元素
	public void delete(int index) {
		if (index<0||index>elements.length-1) {
			throw new RuntimeException("下标越界");
		}else {
			int[] newArr = new int[elements.length-1];
			for (int i = 0; i < newArr.length; i++) {
				if (i<index) {
					newArr[i] = elements[i]; 
				}else {
					newArr[i] = elements[i+1];
				}
			}
			//新数组 替换旧数组
			elements = newArr;
		}
	}
	//取出指定位置元素
	public int get(int index) {
		return elements[index];
	}
	
	//指定位置元素插入元素
	public void insert(int index,int num) {
		
		int[] newArr = new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			if (i<index) {
				newArr[i] = elements[i];			
			}else {
				newArr[i+1] = elements[i];
			}			
		}
		newArr[index] = num;		
		elements = newArr;
	}
	//替换指定位置元素
	public void set(int index,int element) {
		elements[index] = element;
	}
	//线性查找
	public int search(int target) {
		//遍历数组
		for (int i = 0; i < elements.length; i++) {
			if (elements[i]==target) {
				return i;			
			}
		}
		return -1;
	}
	public int bianysearch(int target) {
		//记入开始位置
		int begin = 0;
		//计入结束位置
		int end = elements.length-1;
		//记入中间位置
		int mid = (begin+end)/2;		
		int index = -1;
		while (true) {
			//考虑什么情况下没有这个元素
			if (begin == end||begin>end) {
				return -1;
			}
			
			if(elements[mid] == target) {
				return mid;
			}else {
				if (elements[mid]>target) {
					end = mid-1;
				}else {
					begin = mid+1;
				}
				mid = (begin+end)/2;
			}
		}
	}

}