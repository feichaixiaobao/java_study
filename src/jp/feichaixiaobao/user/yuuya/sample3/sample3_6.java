package jp.feichaixiaobao.user.yuuya.sample3;

/**
 * 練習問題 3 - 6
 * 整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
 * “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
 * ※負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※0 は“正の偶数”であるとする。
 */
public class sample3_6 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("整数値を入力してください:");
		int x = s.nextInt();
		
		//System.out.println(0 % 2); 0 % 2 = 0
		
		if (x % 2 == 1) {
			if (x > 0) {
				System.out.println(x + "は正の奇数。");
			} else {
				System.out.println(x + "は負の奇数。");
			}
		} else {
			//0 は“正の偶数”であるとする。
			if (x >= 0) {
				System.out.println(x + "は正の偶数。");
			} else {
				System.out.println(x + "は負の偶数。");
			}
		}
	}

}
