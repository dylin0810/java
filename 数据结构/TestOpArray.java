package learn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestOpArray {
	public static void main(String[] args) {
		//���鳤�Ȳ��ɱ������
		int[] arr= new int[] {9,8,7};
		//���ٲ鿴����Ԫ��
		System.out.println(Arrays.toString(arr));
		//Ҫ����Ŀ��Ԫ��
		int dst =6;
		//����һ�������飬����Ϊԭ��+1
		int[] newArr = new int[arr.length+1];
		//ԭ����ŵ�������
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		//����Ԫ�طŵ����
		newArr[arr.length] = dst;
		
		//�������滻
		System.out.println(Arrays.toString(newArr));
		arr = newArr;
		
	}
}
