package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 2
２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
 */
public class Sample3_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("二つの整数を入力してください。");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x == y) {
			System.out.println("入力した大きい数字は同じです。" );
		}else if(x > y){
			System.out.println("入力した大きい数字は　" + x);
		}else {
			System.out.println("入力した大きい数字は　" + y);
		}
	}
}
