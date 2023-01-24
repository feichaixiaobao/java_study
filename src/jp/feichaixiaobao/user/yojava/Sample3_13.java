package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 13
月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
※ 	switch 文を使用すること。

 */
public class Sample3_13 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("月を表す数値(1~12)を入力してください。");
		
		int mon = scanner.nextInt();
		
			switch(mon) {
			
			case 1:
				System.out.println("1月は31日である。");
				break;
			case 2:
				System.out.println("2月は28日である。");
				break;
			case 3:
				System.out.println("3月は31日である。");
				break;
			case 4:
				System.out.println("4月は31日である。");
				break;
			case 5:
				System.out.println("5月は31日である。");
				break;
			case 6:
				System.out.println("6月は31日である。");
				break;
			case 7:
				System.out.println("7月は31日である。");
				break;
			case 8:
				System.out.println("8月は31日である。");
				break;
			case 9:
				System.out.println("9月は31日である。");
				break;
			case 10:
				System.out.println("10月は31日である。");
				break;
			case 11:
				System.out.println("11月は31日である。");
				break;
			case 12:
				System.out.println("12月は31日である。");
				break;
				}
		
	}

}
