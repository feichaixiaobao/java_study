package jp.feichaixiaobao.user.kachi.test4;

import java.util.Scanner;

public class Sample4_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		for(int i = 1;i <=10;i++) {
			System.out.print("整数"+i+"を入力してください:");
			int num = s.nextInt();
			count += num;
		}
		int average = count / 10;
		System.out.println(average);
	}

}
