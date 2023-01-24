package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 2 - 5
２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
※計算は整数で行い、小数点以下は切り捨ててよい。
 */
public class Sample2_5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("２つの整数値を入力して下さい。");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int a = (x + y) / 2;
		
		System.out.println("入力した数字の平均値 = " + a);
	}

}
