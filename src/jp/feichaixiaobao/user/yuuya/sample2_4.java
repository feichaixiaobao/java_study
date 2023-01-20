package jp.feichaixiaobao.user.yuuya;

/**
 * 練習問題 2 - 4
 * int 型の変数 x、y にそれぞれ数値を入力し、
 * x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
 */
public class sample2_4 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("xの数値を入力してください:");
		int x = s.nextInt();
		System.out.print("yの数値を入力してください:");
		int y = s.nextInt();
		System.out.println("和は" + (x + y) + ",差は" + (x - y) +
				",積は" + (x * y) + ",商は" + (x / y) + ",余は" + (x % y));
	}
}
