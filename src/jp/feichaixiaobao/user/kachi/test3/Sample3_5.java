package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int x = s.nextInt();
		if(x % 2==0) {
			System.out.println(x + "は偶数です");
		}else {
			System.out.println(x + "は奇数です");
		}
	}

}
