package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("試験の点数を入力してください:");
		int score = s.nextInt();
//		ケース1
		if(score >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
//		ケース2
		if(score >= 80) {
			System.out.println("たいへんよくできました");
		}else if(score >= 60 && score < 80) {
			System.out.println("よくできました");
		}else if(score < 60){
			System.out.println("ざんねんでした");
		}
//		ケース3
		if(score >= 80) {
			System.out.println("優");
		}else if(score >= 70 && score < 80) {
			System.out.println("良");
		}else if(score >= 60 && score < 70) {
			System.out.println("可");
		}else if(score < 60){
			System.out.println("不可");
		}
		
	}

}
