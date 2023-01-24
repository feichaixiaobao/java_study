package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * #3. 分岐----------------------------------------------------------------------------------
練習問題 3 - 1
int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
 */
public class Sample3_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("整数x値を入力して下さい。");
		
		int x = scanner.nextInt();
		
		System.out.println("整数y値を入力して下さい。");
		
		int y = scanner.nextInt();
		
		if( x > y){
			System.out.println("xはyより大きい。");
		}
	}
}
