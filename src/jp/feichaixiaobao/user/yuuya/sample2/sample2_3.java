package jp.feichaixiaobao.user.yuuya.sample2;

/**
 * 練習問題 2 - 3
 * int 型の変数 x に数値を入力し、
 * x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */

public class sample2_3 {
	public static void main(String[] args) {
		java.util.Scanner a = new java.util.Scanner(System.in);	
		System.out.print("ここで入力してください:");
		int x = a.nextInt();
		System.out.println("入力したのは「" + x + "」");
		System.out.println("1乗は" + x + ",2乗は" + (x * x) + 
				",3乗は" + (x * x * x));
		
	}
}
