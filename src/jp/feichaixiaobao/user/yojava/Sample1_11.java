package jp.feichaixiaobao.user.yojava;

import java.util.Random;

/*練習問題 1 - 11
int 型の変数 x に任意の数値を代入し、x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
*/

public class Sample1_11 {
	
	public static void main(String[] args) {
		
		int x = 8;
		
		double y = new Random().nextInt(x);
		
		double z = x / y ;
		
		double d = x % y;
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("商z =" + z);
		System.out.println("余d =" + d);
	}
}
