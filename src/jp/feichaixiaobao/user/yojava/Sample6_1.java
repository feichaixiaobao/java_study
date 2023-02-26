package jp.feichaixiaobao.user.yojava;
/*
 * #6. メソッド----------------------------------------------------------------------------------
練習問題 6 - 1
整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
また、メソッドの動作を検証できるようにプログラムを作成しなさい。
 */
public class Sample6_1 {
	
	public static void main(String[] args) {
		
		 int a = 5;
		 
	   System.out.print("aの2 乗＝" + pow2(a));
	   
	}
		public static int pow2(int a) {
		
		int b = a * a;

			return b;
		
		}
		
	
}
