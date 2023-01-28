package jp.feichaixiaobao.user.yuuya.sample1;

/**
 * 練習問題 1 - 12
 * int 型の変数 x に任意の数値を代入し、
 * インクリメント演算子、デクリメント演算子を適用して結果を表示することにより
 * 演算子の効果を確認するプログラムを作成しなさい。
 */
public class sample1_12 {
	public static void main(String[] args) {
		//インクリメント演算子
		//後ろにいた時
		int x = 100;
		int y = x++;
		System.out.println("x=" + x + ",y=" + y);//x=101,y=100
		//前にいた時
		int m = 100;
		int n = ++m;
		System.out.println("m=" + m + ",n=" + n);//m=101,n=101
		
		//デクリメント演算子
		//後ろにいた時
		int i = 100;
		int j = i--;
		System.out.println("i=" + i + ",j=" + j);//i=99,j=100
		//前にいた時
		int a = 100;
		int b = --a;
		System.out.println("a=" + a + ",b=" + b);//a=99,b=99
		
	}
}
