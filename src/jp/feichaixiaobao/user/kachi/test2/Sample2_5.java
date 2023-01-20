package jp.feichaixiaobao.user.kachi.test2;

import java.util.Scanner;

public class Sample2_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字1を入力してください：");
		int x = s.nextInt();
		System.out.print("数字2を入力してください：");
		int y = s.nextInt();
		System.out.println("平均値:" + (x + y) / 2);
	}

}
