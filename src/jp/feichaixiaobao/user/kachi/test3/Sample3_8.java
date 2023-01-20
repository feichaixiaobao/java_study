package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("中間試験の点数を入力してください:");
		int s1 = s.nextInt();
		System.out.print("期末試験の点数を入力してください:");
		int s2 = s.nextInt();
		if(s1 >= 60 && s2 >=60) {
			System.out.println("合格");
		}else if(s1 + s2 >= 130) {
			System.out.println("合格");
		}else if(s1 + s2 >= 100 && s1 >= 90 || s2 >=90) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}

}
