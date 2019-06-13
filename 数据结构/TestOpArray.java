package learn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestOpArray {
	public static void main(String[] args) {
		//数组长度不可变的问题
		int[] arr= new int[] {9,8,7};
		//快速查看数组元素
		System.out.println(Arrays.toString(arr));
		//要加入目标元素
		int dst =6;
		//创建一个新数组，长度为原来+1
		int[] newArr = new int[arr.length+1];
		//原数组放到新数组
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		//把新元素放到最后
		newArr[arr.length] = dst;
		
		//因数组替换
		System.out.println(Arrays.toString(newArr));
		arr = newArr;
		
	}
}
