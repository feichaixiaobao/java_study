package jp.feichaixiaobao.user.yuuya.sample3;

/**
 * 練習問題 3 - 5
 * 正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
 * ※奇数、偶数の判定には除算の余りを利用する。
 */
public class sample3_5 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("正の整数値を入力してください:");
		int x = s.nextInt();
		
		if (x % 2 == 1) {
			System.out.println(x + "は奇数。");
		} else {
			System.out.println(x + "は偶数。");
		}
	}

}
