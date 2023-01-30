package jp.feichaixiaobao.user.uuwen.Sample3;

import java.util.Scanner;

/*
練習問題 3 - 13
月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
※ 	switch 文を使用すること。
*/

public class Sample3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("月を入力してください: ");
        int month = scanner.nextInt();

        switch(month){
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	        	System.out.print("31日");
                break;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	        	System.out.print("30日");
                break;
	        case 2:
	        	System.out.print("28日");
                break;
	        default:
	            System.out.println( "入力が間違っています" );
	            break;
	    }
    }
}
