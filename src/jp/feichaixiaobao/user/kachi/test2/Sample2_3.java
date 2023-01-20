package jp.feichaixiaobao.user.kachi.test2;

import java.util.Scanner;

public class Sample2_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int num = s.nextInt();
		System.out.println("1 乗した結果" + Math.pow(num, 1));
		System.out.println("2 乗した結果" + Math.pow(num, 2));
		System.out.println("3 乗した結果" + Math.pow(num, 3));
	}

}
