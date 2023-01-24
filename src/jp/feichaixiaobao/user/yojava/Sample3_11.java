package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 11
月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
表示する祝日は以下の日とします。
・１月：元日、成人の日
・２月：建国記念の日
・３月：春分の日
・４月：昭和の日
・５月：憲法記念日、みどりの日、こどもの日
・７月：海の日
・９月：敬老の日、秋分の日
・１０月：体育の日
・１１月：文化の日、勤労感謝の日
・１２月：天皇誕生日
※switch 文を使用すること。
 */
public class Sample3_11 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("月を表す数値を入力してください。");
		
		int mon = scanner.nextInt();
		
		
		for(int m = mon; m <= 12; m ++) {		
				switch(m) {
				case 1:
					System.out.println("１月：元日、成人の日");
					break;
					
				case 2:
					System.out.println("２月：建国記念の日");
					break;
					
				case 3:
					System.out.println("３月：春分の日");
					break;
					
				case 4:
					System.out.println("４月：昭和の日");
					break;
					
				case 5:
					System.out.println("５月：憲法記念日、みどりの日、こどもの日");
					break;
					
				case 6:
					System.out.println("６月：祝日無");
					break;
					
				case 7:
					System.out.println("７月：海の日");
					break;
					
				case 8:
					System.out.println("８月：祝日無");
					break;
					
				case 9:
					System.out.println("９月：敬老の日、秋分の日");
					break;
					
				case 10:
					System.out.println("１０月：体育の日");
					break;
					
				case 11:
					System.out.println("１１月：文化の日、勤労感謝の日");
					break;
					
				case 12:
					System.out.println("１２月：天皇誕生日");
					break;
					
				}
				
			}
    }	
}
	

