package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int x = s.nextInt();
		if(x >= 0) {
			if(x % 2 == 0) {
				System.out.println(x + "は正の偶数");
			}else {
				System.out.println(x + "は正の奇数");
			}
		}else {
			if(x % 2 == 0) {
				System.out.println(x + "は负の偶数");
			}else {
				System.out.println(x + "は负の奇数");
			}
		}
	}

}
