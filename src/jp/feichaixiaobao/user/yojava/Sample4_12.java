package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 12
数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
 */
public class Sample4_12 {
	
	public static void main(String[] args) {
		
		int total = 0;
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("数値を入力してください。合計が100を超えたら入力止めます。");
			
			int num = scanner.nextInt();
			
			total = total + num;
			
			if(total > 100) {
				
				break;
			}
		}
		
		System.out.println("入力した数値合計は　" + total);
		
	}

}
