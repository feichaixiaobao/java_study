package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * #5. 配列----------------------------------------------------------------------------------
練習問題 5 - 1
次のプログラムを作成しなさい。
・10 個の数値を入力する。
・入力された各々の数値を 2 倍にして表示する。

 */
public class Sample5_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for(int i = 0;i < 10; i++) {
			nums[i] =scanner.nextInt();
		}
		
		for(int i = 0; i < 10; i ++) {
			System.out.println( nums[i] * 2);
		}
	}
}
