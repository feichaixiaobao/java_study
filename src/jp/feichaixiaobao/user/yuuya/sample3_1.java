package jp.feichaixiaobao.user.yuuya;

/**
 * 練習問題 3 - 1
 * int 型の変数 x、y にそれぞれ数値を入力し、
 * x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
 */
public class sample3_1 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("xの数値を入力してください:");
		int x = s.nextInt();
		System.out.print("yの数値を入力してください:");
		int y = s.nextInt();
		
		if (x > y) {
			System.out.println("xはyより大きい。");
		}
	}
}
