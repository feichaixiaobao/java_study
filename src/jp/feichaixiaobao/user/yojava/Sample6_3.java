package jp.feichaixiaobao.user.yojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 6 - 3
２つの整数の大きい方を選ぶメソッドを作成しなさい。２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。
 */
public class Sample6_3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		
		System.out.print("大きい数値は" + max(max(x, y),z) + "です。");
		
	}
	
	public static int max(int x , int y) {
		int b = 0;
		
		if(x > y) {
			
			b = x;
		}else if(x < y) {
			
			b = y;
		}
		
		
		return b;
	}
}
