package jp.feichaixiaobao.user.yuuya.sample4;

//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。

public class sample4_3 {
	public static void main(String[] args) {
		int x = 1;
		for(int i = 1; i <= 8; i++) {
			x *= 2;
			System.out.println("2 の " + i + " 乗 は " + x);
		}
	}
}
