package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 5
正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
※奇数、偶数の判定には除算の余りを利用する。
 */
public class Sample3_5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	     System.out.println("正の整数xを入力してください。");
	     
	     int x = scanner.nextInt();
	     
	     if((x % 2) == 1) {
	    	 
	    	 System.out.println("入力した数字は奇数です。");
	     }else if ((x % 2) == 0) {
	    	 
	    	 System.out.println("入力した数字は偶数です。");
	     }
		
		
	}
}
