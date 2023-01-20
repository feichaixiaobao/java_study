package jp.feichaixiaobao.user.ethanlmx;

import java.util.Scanner;

public class sample3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("please input x");
		x = sc.nextInt();
		System.out.println("please input y");
		y = sc.nextInt();
		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else {
			System.out.print("“xとyが同じ");
		}

	}
}