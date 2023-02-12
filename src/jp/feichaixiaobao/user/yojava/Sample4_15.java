package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 15
入力された数が素数かどうかを判定するプログラムを作成しなさい。
※判定する数は 4 以上としてよい。
 */
public class Sample4_15 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1以上の数値を入力してください。");
		
		int num = scanner.nextInt();
			
			if(num < 2) {
				
				System.out.println("入力した数値" + num + "素数ではありません。");
			}
		
			for(int i = 2; i < num; i++) {
				
				if( num % i == 0) {
					
					System.out.println("入力した数値 " + num + " 素数ではありません。");
					
					return;
				}
				
				
				
			}
			
			System.out.println("入力した数値" + num + "素数です。");
			
	}
}
