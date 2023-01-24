package jp.feichaixiaobao.user.yojava;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * 練習問題 2 - 6
年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
※日数の計算は閏年等を考慮せず、年齢×365とする。
 */
public class Sample2_6 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("生まれた年を入力してください。");
	
	int y = scanner.nextInt();
	LocalDate d = LocalDate.now();
	int current_Y = d.getYear();
	int years = current_Y - y;
	int days =years * 365;
	
	System.out.println("今の年齢 = " +years);
	System.out.println("入力した数字の平均値 = " + days);
	
	}
}
 