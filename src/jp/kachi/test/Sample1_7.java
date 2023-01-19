package jp.kachi.test;

public class Sample1_7 {
	public static void main(String[] args) {
		int x = 101;
		int y = 202;
		int z;
		z = x;
		x = y;
		y = z;
		System.out.println("x=" + x + ",y=" + y);
	}

}
