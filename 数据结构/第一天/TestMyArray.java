package learn;

import demo1.util.MyArray;

public class TestMyArray {
	public static void main(String[] args) {
		MyArray ma  = new MyArray();
		int size = ma.size();
		System.out.println(size);
		//可变数组添加一个元素
		ma.add(99);
		System.err.println(ma.size());
		ma.show();
		ma.add(98);
		ma.add(99999);
		ma.delete(0);
		System.out.println(ma.size());
		System.out.println(ma.get(0));
		ma.insert(0, 99);
		ma.insert(3, 2222);
		ma.show();
		ma.add(98);
		ma.add(85);
		ma.show();
		ma.insert(4, 16);
		ma.show();
		ma.set(0, 100);
		ma.show();
		System.out.println(ma.search(0));
		System.out.println(ma.bianysearch(98));
	}
}
