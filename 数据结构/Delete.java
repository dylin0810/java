package learn;

import java.util.Arrays;

public class Delete {
	//ɾ�������е�Ԫ��
	public static void main(String[] args) {
		//Ŀ��
		int[] arr = new int[] {9,8,7,6,5,4};
		//Ҫɾ��Ԫ�ص��±�
		int dst = 2;
		//����һ�������� ����ԭ����-1
		int[] newArr = new int[arr.length-1];
		//����ԭ�������Ҫɾ�������ȫ��Ԫ��
		
		for (int i = 0; i < newArr.length; i++) {
			if (i<dst) {
				newArr[i] =arr[i];
			}else {
				newArr[i]= arr[i+1];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
