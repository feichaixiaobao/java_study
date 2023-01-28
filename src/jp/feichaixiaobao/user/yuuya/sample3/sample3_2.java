package jp.feichaixiaobao.user.yuuya.sample3;

/**
 * 練習問題 3 - 2
 * ２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
 */
public class sample3_2 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("２つの整数値を入力してください");
		int x = s.nextInt();
		int y = s.nextInt();
		
		if (x < y) {
			System.out.println("大きい方の数は" + y);
		} else if (x > y){
			System.out.println("大きい方の数は" + x);
		} else {
			System.out.println("xとyは等しい。");
		}
	}
}
