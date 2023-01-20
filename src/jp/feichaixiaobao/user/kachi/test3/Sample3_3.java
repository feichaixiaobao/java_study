package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字xを入力してください：");
		int x = s.nextInt();
		System.out.print("数字yを入力してください：");
		int y = s.nextInt();
		if(x >y) {
			System.out.println(x + "は" + y+ "より大きい");
		}else {
			System.out.println(x + "は" + y+ "より小きい");
		}
	}

}
