package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 12
好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
※switch 文を使用する。
※選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
※題材は鮨でなくても良い。
 */
public class Sample3_12 {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("好きな鮨（すし）を入力してください。");
	
	int sushi = scanner.nextInt();
	
	switch(sushi) {
	case 1:
		System.out.println("まぐろ");
		break;
		
	case 2:
		System.out.println("えび");
		break;
		
	case 3:
		System.out.println("こはだ");
		break;
		
	case 4:
		System.out.println("サーモン");
		break;
		
	case 5:
		System.out.println("ウナギ");
		break;
		
	case 6:
		System.out.println("卵");
		break;
		
	
	
		}
	}
}
