package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_2 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("数字1を入力してください：");
		int x = s.nextInt();
		System.out.print("数字2を入力してください：");
		int y = s.nextInt();
		if(x > y) {
			System.out.println("大きい方:" + x);
		}else {
			System.out.println("大きい方:" + y);
		}
	}

}
