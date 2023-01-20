package jp.feichaixiaobao.user.kachi.test2;

import java.util.Scanner;

public class Sample2_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字xを入力してください：");
		int x = s.nextInt();
		System.out.print("数字yを入力してください：");
		int y = s.nextInt();
		System.out.println("x+y=" + (x + y));
		System.out.println("x-y=" + (x - y));
		System.out.println("x/y=" + (x / y));
		System.out.println("x%y=" + (x % y));
	}

}
