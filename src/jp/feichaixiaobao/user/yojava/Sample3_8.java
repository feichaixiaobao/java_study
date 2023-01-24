package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 8
中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
・両方とも60 点以上の場合、合格
・合計が130 点以上の場合、合格
・合計が100 点以上で、どちらかの試験が 90 点以上であれば合格
・上記以外は不合格
 */
public class Sample3_8 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("中間試験の点数（ 0 点～ 100 点）を入力してください。");
		
		int mp = scanner.nextInt();
		
		System.out.println("期末試験の点数（ 0 点～ 100 点）を入力してください。");
		
		int ep = scanner.nextInt();
		
		int total = mp + ep;
		
		
		if(mp >= 60 || ep >= 60 || total >= 130 || (total >= 100 && (mp >= 90 || ep >=90))) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		 
		
	}

}
