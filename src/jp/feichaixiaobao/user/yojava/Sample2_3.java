package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 2 - 3
int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */
public class Sample2_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください。");
		
		int x = scanner.nextInt();
		
		for(int i = 1; i <= 3; i++) {
			
		System.out.println("xを"+ i +"乗した結果=" + Math.pow(x, i));
		
		}
	}
}
