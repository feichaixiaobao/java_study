package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 9
曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
・開いているか、休診であるかは、次の表に従います。
--------------------------------------------------
      日曜	 月曜	火曜  水曜	木曜  金曜	 土曜
--------------------------------------------------
午前	休診  ○	休診   ○	  ○   休診	  ○
--------------------------------------------------
午後	休診  ○	○	   ○	  ○	○	  休診
--------------------------------------------------
夜間	休診  ○	○	  休診	 ○	    ○	  休診
--------------------------------------------------

※曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
--------------------------------------------------
>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
>0=午前、1=午後、2=夜間
--------------------------------------------------
 */
public class Sample3_9 {
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("(0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜)");
		System.out.println("曜日の数値を入力してください。");
		
		int w = scanner.nextInt();
		
		System.out.println("(0=午前、1=午後、2=夜間)");
		System.out.println("時間帯の数値を入力してください。");
		
		int n = scanner.nextInt();
		
		switch(w) {
		case 0:
			System.out.println("休診");
			break;
			
		case 1:
		case 4:
			System.out.println("開いている");
			break;
			
		case 2:
		case 5:
			if(n == 0) {
				System.out.println("休診");
			}else {
				System.out.println("開いている");
			}
			break;
		case 3:
			if(n == 2) {
				System.out.println("休診");
			}else {
				System.out.println("開いている");
			}
			break;
		
		case 6:
			
			if(n == 0) {
				System.out.println("開いている");
			}else {
				System.out.println("休診");
			}
			break;
		
		}
	}

}
