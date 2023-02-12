package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 18
数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
 */
public class Sample4_18 {
	
	public static void main(String[] args) {
		
		double num = 0;
		double total= 0;
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("数値を入力してください。");
			
			num = scanner.nextDouble();
			
			total = total + num;
			
			if(num == 0) {
				
				break;
			}
		}
		
		System.out.println("total=" + total);
	}

}
