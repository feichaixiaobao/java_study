package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 2 - 1
String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
 */
public class Sample2_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("文字列を入力してください。");
		
		
		String s = scanner.next();
		
		System.out.println("入力した文字列は" +"[" + s + "]" + "です。");
	}

}
