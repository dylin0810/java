package learn;

public class TestSearch {
	//查找某个元素线性查找
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,5,6,8,4,9,0};
		int target = 8;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}
}
