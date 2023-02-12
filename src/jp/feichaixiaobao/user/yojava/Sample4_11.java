package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 11
個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
例：
14
01234567890123
 */
public class Sample4_11 {
	
	public static void main(String[] args) {
		
		
		int num = 0;
		
		System.out.print(" 0 ～ 9 の数字 表示個数を入力してください。");
		
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		
		for(int i =0; i < num; i++) {
			
			System.out.print( i % 10 );//
		}
		
		
	}
}
