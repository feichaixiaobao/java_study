package jp.feichaixiaobao.user.uuwen.Sample1;

/*
 練習問題 1 - 10
 int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。

 */

public class Sample1_10 {

	public static void main(String[] args) {
		int x = 5;
		System.out.println("x を 1 乗, x = " + x);
		System.out.println("x を 2 乗, x = " + x * x);
		System.out.println("x を 3 乗, x = " + x * x * x );
		
		double result = Math.pow(x, 3);
		System.out.println("result = " + (int)result);
	}

}
