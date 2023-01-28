package jp.feichaixiaobao.user.yuuya.sample3;

/**
 * 練習問題 3 - 7
 * 試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
 */
public class sample3_7 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("試験の点数を入力してください:");
		int x = s.nextInt();
		
		//試験は 100 点満点（ 0 点～ 100 点）
		if (x >= 0 & x <= 100) {
			
			//ケース1
			if (x >= 60) {
				System.out.println("合格");
			} else {
				System.out.println("不合格");
			}
			
			//ケース2
			if (x >= 80) {
				System.out.println("たいへんよくできました。");
			} else if (x >= 60 & x < 80) {
				System.out.println("よくできました。");
			} else {
				System.out.println("ざんねんでした。");
			}
			
			//ケース3
			if (x >= 80) {
				System.out.println("優");
			} else if (x >= 70 & x < 80) {
				System.out.println("良");
			} else if (x >= 60 & x < 70) {
				System.out.println("可");
			} else {
				System.out.println("不可");
			}
			
			
		} else {
			System.out.println("入力した点数は　0 点～ 100 点　です。");
		}
	}

}
