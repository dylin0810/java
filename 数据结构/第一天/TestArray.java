package learn;

public class TestArray {
	public static void main(String[] args) {
		//��������
		int[] arr1 =new int[3];
		//��ȡ���鳤��
		int length1 = arr1.length;
		System.out.println(length1);
		//���������Ԫ�أ�Ԫ��������
		
		int element0 = arr1[0];
		System.out.println(element0);
		//��ֵ
		arr1[0] = 99;
		System.out.println(arr1[0]);
		arr1[1] = 98;
		arr1[2] = 91;
		//��������
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 element"+i+":"+arr1[i]);
		//��������ͬʱ Ϊ�����е�Ԫ�ظ�ֵ
		}
			
			
		int[] arr2 = new int[] {90,80,70,60,50};
		//���鳤��Ϊ5
		System.out.println(arr2.length);
			
		
		
		
		
		
	}
}
