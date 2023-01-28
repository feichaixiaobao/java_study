package jp.feichaixiaobao.user.yuuya.sample4;

//7 の階乗を計算し、表示するプログラムを作成しなさい。

public class sample4_4 {
	public static void main(String[] args) {
		int x = 7;
		for(int i = x - 1; i > 0; i--) {
			x *= i; 
		}
		System.out.println("7の階乗は" + x);
	}
}
