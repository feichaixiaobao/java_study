package jp.feichaixiaobao.user.yojava;

/*
 * 練習問題 3 - 3
int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
 */
import java.util.Scanner;

public class Sample3_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
         System.out.println("整数xを入力してください。");
		
		int x = scanner.nextInt();
		
        System.out.println("整数yを入力してください。");

		int y = scanner.nextInt();
		
		 if(x > y){
			System.out.println("xはyより大きい");
		}else {
			System.out.println("xはyより小さい");
		}
	}
}
