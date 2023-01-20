package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字xを入力してください：");
		int x = s.nextInt();
		System.out.print("数字yを入力してください：");
		int y = s.nextInt();
		if(x >y) {
			System.out.println(x + "は" + y+ "より大きい");
		}else if(x < y) {
			System.out.println(x + "は" + y+ "より小きい");
		}else if(x == y) {
			System.out.println(x + "と" + y+ "が等しい");
		}
	}

}
