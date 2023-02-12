package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 10
個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
 */
public class Sample4_10 {
	
	public static void main(String[] args) {
			
			
			int num = 0;
			
			System.out.print(" * 表示個数を入力してください。");
			
			Scanner scanner = new Scanner(System.in);
			
			num = scanner.nextInt();
			
			for(int i =1; i <= num; i++) {
				
				System.out.print("*" );
			}
			
			
		}
}
