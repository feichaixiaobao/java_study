package jp.feichaixiaobao.user.yuuya;

/**
 * 練習問題 2 - 1
 * String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
 */
public class sample2_1 {
	public static void main(String[] args) {
		java.util.Scanner a = new java.util.Scanner(System.in);		
		System.out.print("ここで入力してください:");
		String s = a.next();
		System.out.println("入力したのは「" + s + "」");
	}
}
