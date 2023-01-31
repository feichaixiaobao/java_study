package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("月を表す数値を入力してください");
		int m = s.nextInt();
		switch(m) {
		case 1:
			System.out.println("1 月は 31 日とします");
			break;
		case 2:
			System.out.println("2 月は 28 日とします");
			break;
		case 3:
			System.out.println("3 月は 31 日とします");
			break;
		case 4:
			System.out.println("4 月は 30 日とします");
			break;
		case 5:
			System.out.println("5 月は 31 日とします");
			break;
		case 6:
			System.out.println("6 月は 30 日とします");
			break;
		case 7:
			System.out.println("7 月は 31 日とします");
			break;
		case 8:
			System.out.println("8 月は 31 日とします");
			break;
		case 9:
			System.out.println("9 月は 30 日とします");
			break;
		case 10:
			System.out.println("10 月は 31 日とします");
			break;
		case 11:
			System.out.println("11 月は 30 日とします");
			break;
		case 12:
			System.out.println("12 月は 31 日とします");
			break;
		default:
			System.out.println("入力が間違っています");
		}
	}

}
