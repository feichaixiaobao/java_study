package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 2 - 4
int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
 */
public class Sample2_4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("空白を挟んで、x、y にそれぞれ数値を入力してください。");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println("x+y= " + (x + y));	
		System.out.println("x-y= " + (x - y));	
		System.out.println("x*y= " + (x * y));	
		System.out.println("x/y= " + (x / y));	
		System.out.println("x&y= " + (x % y));	
	}
}
