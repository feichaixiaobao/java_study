package jp.feichaixiaobao.user.yuuya.sample2;

/**
 * 練習問題 2 - 6
 * 年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
 * ※日数の計算は閏年等を考慮せず、年齢×365とする。
 */
public class sample2_6 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("年齢を入力してください:");
		int x = s.nextInt();
		System.out.println("生まれてからおおよそ" + (x * 365) + "日が過ぎました");
	}

}