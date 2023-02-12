package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 5
整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
※計算は整数で行い、小数点以下は切り捨ててよい。
 */
public class Sample4_5 {
	
	public static void main(String[] args) {
		
		double ave ;
		double total = 0 ;
		int n = 10;
		
		System.out.println("数値を"+ n +"回入力してください。");
		
		for(int i = 1; i <= n; i++) {
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println( i +"個目の数値を入力してください。");
			
			int num = scanner.nextInt();
			
			
			total = total + num;
			
		}
		
		System.out.println(total);
		
		ave = total / n;
		
		System.out.println(ave);
	}
}
