package learn;

import java.util.Arrays;

public class Delete {
	//删除数组中的元素
	public static void main(String[] args) {
		//目标
		int[] arr = new int[] {9,8,7,6,5,4};
		//要删除元素的下标
		int dst = 2;
		//创建一个新数组 长度原数组-1
		int[] newArr = new int[arr.length-1];
		//复制原数组除了要删除以外的全部元素
		
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
