package jp.feichaixiaobao.user.yuuya.sample3;

/**
 * 練習問題 3 - 13
 * 月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
 */
public class sample3_13 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("月を表す数値を入力してください: ");
		int x = s.nextInt();
		
		if(x > 12 | x <= 0) {
			System.out.println("入力が間違っています");
			return;
		}

		switch (x) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(x + "月は31日");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(x + "月は30日");
			break;
		case 2:
			System.out.println("2月は28日");
			break;
		}
	}
}
