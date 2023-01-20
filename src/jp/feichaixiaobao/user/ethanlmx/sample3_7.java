package jp.feichaixiaobao.user.ethanlmx;

import java.util.Scanner;

public class sample3_7 {
	public static void main(String[] args) {

		System.out.println("please input score");

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		System.out.println("please input case(1 or 2 or 3)");
		int scorecace = sc.nextInt();

		switch (scorecace) {
		case 1:
			if (score >= 60) {
				System.out.println("合格");
			} else {
				System.out.println("不合格");
			}
			break;
		case 2:
			if (score >= 80) {
				System.out.println("たいへんよくできました");
			} else if (score >= 60 && score < 80) {
				System.out.println("よくできました。");
			} else {
				System.out.println("ざんねんでした。");
			}
			break;
		case 3:
			if (score >= 80) {
				System.out.println("優");
			} else if (score >= 70 && score < 80) {
				System.out.println("良");
			} else if (score >= 60 && score < 70) {
				System.out.println("良");
			} else {
				System.out.println("不可");
			}
			break;
		}

	}
}
