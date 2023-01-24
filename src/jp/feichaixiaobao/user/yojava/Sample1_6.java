package jp.feichaixiaobao.user.yojava;

/*
 * 練習問題 1 - 6
次のプログラムを作成しなさい。
int 型の変数 x に数値 7 を代入する。
変数 x の値を 3 倍にする。
変数 x の値を表示する。
変数 x の値を半分（1/2）にする。
変数 x の値を表示する。
 */
public class Sample1_6 {
	
	public static  void main(String[] args) {
		
		int x = 7;
		
		x = x * 3;
		
		System.out.println("x=" + x);
		
		x = x / 2 ;// int?
		
		System.out.println("x=" + x );
	
	}

}
