package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 4
int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。

 */
public class Sample3_4 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
     System.out.println("整数xを入力してください。");
	
	int x = scanner.nextInt();
	
    System.out.println("整数yを入力してください。");

	int y = scanner.nextInt();
	
	if(x == y) {
		System.out.println("xとyは等しい。" );
	}else if(x > y){
		System.out.println("xはyより大きい");
	}else {
		System.out.println("xはyより小さい");
	}
}
}
