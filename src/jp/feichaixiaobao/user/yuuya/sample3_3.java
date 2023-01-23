package jp.feichaixiaobao.user.yuuya;

/**
 * 練習問題 3 - 3
 * int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、
 * x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
 */
public class sample3_3 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("xの数値を入力してください:");
		int x = s.nextInt();
		System.out.print("yの数値を入力してください:");
		int y = s.nextInt();
		
		if (x > y) {
			System.out.println("xはyより大きい。");
		} else if (x < y) {
			System.out.println("xはyより小さい。");
		} else {
			System.out.println("xとyは等しい。");
		}
	}

}
