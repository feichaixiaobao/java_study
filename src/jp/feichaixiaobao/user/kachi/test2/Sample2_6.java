package jp.feichaixiaobao.user.kachi.test2;

import java.util.Scanner;

public class Sample2_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("おいくつですか：");
		int age = s.nextInt();
		System.out.println("生まれてから" + (age * 365) + "日、おめでとうございます");
		
	}

}
