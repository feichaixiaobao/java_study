package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 6 - 2
２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
また、メソッドの動作を検証できるようにプログラムを作成しなさい。
※平均の計算は整数で行い、小数点以下は切り捨ててよい。
 */
public class Sample6_2 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 23;
		
		int z = ave(x, y);
		System.out.print(z);
		
	}
	
	public static int ave(int x, int y) {
		
		int z =( x + y ) / 2;
		
		return z;
	}

}
