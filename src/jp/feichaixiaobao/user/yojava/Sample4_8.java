package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 8
自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
 */
public class Sample4_8 {
	
	public static void main(String[] args) {
		
		
		int max = 0;
		int num = 0;
		
		for(int i =1; i <= 10; i++) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println(" " + i + " 回目の自然数（正の整数）を入力してください。");
			
			num = scanner.nextInt();
			
			if(num > max) {
				
				max = num;
			}
			
		}
		
		System.out.print("入力した最大値＝" + max);
	}
}
