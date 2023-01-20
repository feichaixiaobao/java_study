package jp.feichaixiaobao.user.ethanlmx;

import java.util.Scanner;

public class sample3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("please input x");
		x = sc.nextInt();
		System.out.println("please input y");
		y = sc.nextInt();
		if (x > y) {
			System.out.print("“xはyより大きい。");
		} else if (x < y) {
			System.out.print("“xはyより小さい。");
		} else {
			System.out.print("“xとyが同じ");
		}

	}
}
