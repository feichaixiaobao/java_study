package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("好き料理を選択して下さい：１：ラメン　２：天麩羅　３：寿司　４：おにぎり");
		int type = s.nextInt();
		switch(type) {
		case 1:
			System.out.println("ラメンをください");
			break;
		case 2:
			System.out.println("天麩羅をください");
			break;
		case 3:
			System.out.println("寿司をください");
			break;
		case 4:
			System.out.println("おにぎりをください");
			break;
		}
		
	}

}
