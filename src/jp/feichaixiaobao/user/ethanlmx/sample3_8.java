package jp.feichaixiaobao.user.ethanlmx;

import java.util.Scanner;

public class sample3_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("please input score of midterm exam");
		x = sc.nextInt();
		System.out.println("please input final exam");
		y = sc.nextInt();
		if (((x > 60) && (y > 60)) || (x + y > 130) || ((x + y) > 100) && (x > 90) && (y > 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

	}
}
