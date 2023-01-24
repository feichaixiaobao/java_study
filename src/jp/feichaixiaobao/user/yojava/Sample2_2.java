package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 2 - 2
int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
 */
public class Sample2_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください。");
		int x  = scanner.nextInt();
		
		System.out.println("入力した数字は　" + x +"　です。");
	}

}
