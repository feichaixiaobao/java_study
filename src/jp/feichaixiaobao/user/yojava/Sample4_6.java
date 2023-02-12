package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 6
整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
 */
public class Sample4_6 {
	
public static void main(String[] args) {
		
		int mNum = 0;
		int kNum = 0;
		
		
		int n = 10;
		
		System.out.println("整数、0 か 1 を"+ n +"回入力してください。");
		
		for(int i = 1; i <= n; i++) {
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println( i +"個目の数値を入力してください。");
					
			int num = scanner.nextInt();
			
			if(num == 0) {
				
				mNum ++;
			}else if(num == 1) {
				
				kNum ++;
			}
		
			
		}
		
		System.out.println("負けの総数=" + mNum);
		System.out.println("勝ちの総数=" + kNum);
		
		
	}
}
