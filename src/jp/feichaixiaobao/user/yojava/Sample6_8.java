package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 6 - 8
メソッドを再帰的に呼び出すことによって、フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
最初の２つの項、0 番目を 0、1 番目を 1 とします。
このメソッドを使用して、11 番目から 20 番目までの項を表示するプログラムを作成しなさい。
※フィボナッチ数列：
それぞれの項がその直前の２つの項の和になっている数列のこと。
例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 */
public class Sample6_8 {
	
	public static void main(String[] args) {
		
		fibNum(10,20);
		
	} 
	
	public static void fibNum(int a, int b) {
		
		int x = 0;
		int y = 1;

		
		for(int i = 0; i < b; i ++) {
			
			int z = x + y;
									
			if(i >= a ) {
				
				System.out.print(z);
				System.out.print(",");

			}
			x = y;
			y = z;
		}
	}
}
