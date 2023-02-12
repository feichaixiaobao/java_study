package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 4 - 3
2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
 */
public class Sample4_3 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) {
			
			System.out.println(Math.pow(2, i));
		}
	}
}
