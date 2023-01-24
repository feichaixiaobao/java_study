package jp.feichaixiaobao.user.yojava;

/*
 * 練習問題 1 - 10
int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */
public class Sample1_10 {
	
	public static void main(String[] args) {
		
		int x = 8;
		
		System.out.println("xの1乗=" + x);
		System.out.println("xの1乗=" + x * x);
		System.out.println("xの1乗=" + x * x * x);
		
		
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("xの1乗=" + Math.pow(x, i));
		}
	}

}
