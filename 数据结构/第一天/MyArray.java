package demo1.util;

import java.util.Arrays;

import javax.lang.model.util.Elements;
import javax.management.RuntimeErrorException;

public class MyArray {
	//���ڴ洢���ݵ�����
	private int[] elements;
	public MyArray() {
		// TODO Auto-generated constructor stub
		elements = new int[0];
	}
	//��ȡ����
	public int size() {
		return elements.length;
	}
	//ĩβ����һ��Ԫ��
	public void add(int element) {
		int[] newArr =new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	//��ӡ����Ԫ�ص�����̨
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	//ɾ��ĳ��Ԫ��
	public void delete(int index) {
		if (index<0||index>elements.length-1) {
			throw new RuntimeException("�±�Խ��");
		}else {
			int[] newArr = new int[elements.length-1];
			for (int i = 0; i < newArr.length; i++) {
				if (i<index) {
					newArr[i] = elements[i]; 
				}else {
					newArr[i] = elements[i+1];
				}
			}
			//������ �滻������
			elements = newArr;
		}
	}
	//ȡ��ָ��λ��Ԫ��
	public int get(int index) {
		return elements[index];
	}
	
	//ָ��λ��Ԫ�ز���Ԫ��
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
	//�滻ָ��λ��Ԫ��
	public void set(int index,int element) {
		elements[index] = element;
	}
	//���Բ���
	public int search(int target) {
		//��������
		for (int i = 0; i < elements.length; i++) {
			if (elements[i]==target) {
				return i;			
			}
		}
		return -1;
	}
	public int bianysearch(int target) {
		//���뿪ʼλ��
		int begin = 0;
		//�������λ��
		int end = elements.length-1;
		//�����м�λ��
		int mid = (begin+end)/2;		
		int index = -1;
		while (true) {
			//����ʲô�����û�����Ԫ��
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