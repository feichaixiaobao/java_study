package jp.feichaixiaobao.user.yuuya;

/**
 * 練習問題 2 - 5
 * ２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
 * ※計算は整数で行い、小数点以下は切り捨ててよい。
 */
public class sample2_5 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("２つの整数値を入力してください");
		System.out.print("一つ目は:");
		int x = s.nextInt();
		System.out.print("二つ目は:");
		int y = s.nextInt();
		System.out.println(x + "と" + y + "の平均値は" + ((x + y) / 2));
	}
}
