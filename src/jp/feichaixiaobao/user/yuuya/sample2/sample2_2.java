package jp.feichaixiaobao.user.yuuya.sample2;

/**
 * 練習問題 2 - 2
 * int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
 */
public class sample2_2 {
	public static void main(String[] args) {
		java.util.Scanner a = new java.util.Scanner(System.in);		
		System.out.print("ここで入力してください:");
		int x = a.nextInt();
		System.out.println("入力したのは「" + x + "」");
		
	}


}
