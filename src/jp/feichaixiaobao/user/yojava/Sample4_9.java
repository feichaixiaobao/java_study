package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 9
整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
 */
public class Sample4_9 {
	
	public static void main(String[] args) {
			
			
			int max = 0;
			int min = 0;
			int num = 0;
			
			for(int i =1; i <= 10; i++) {
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println(" " + i + " 回目の自然数（正の整数）を入力してください。");
				
				num = scanner.nextInt();
				
				if(i ==1) {
					
					max = num;
					min = num;
					
				}else {
			
					if(num > max) {
						
						max = num;
						
					}else {
						
						min = num;
					}
				}
				
			}
			
			System.out.print("入力した最大値＝" + max);
			System.out.print("入力した最小値＝" + min);
		}
}
