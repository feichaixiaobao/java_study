package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 4 - 2
九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
 */
public class Sample4_2 {

		public static void main(String[] args) {
			
			int num = 3;
			
			for(int i = 1; i <= 9; i++) {
				
				System.out.print(num * i + " ");
			}
		}
}
