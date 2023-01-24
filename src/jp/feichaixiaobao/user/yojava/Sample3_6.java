package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 3 - 6
   整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
※負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
※0 は“正の偶数”であるとする。
 */
public class Sample3_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
         System.out.println("整数xを入力してください。");
	     
	     int x = scanner.nextInt();
	     
	     if(x >= 0) {
		     if((x % 2) == 0) {
		    	 
		    	 System.out.println("入力した数字は正の偶数です。");
		     }else {
		    	 
		    	 System.out.println("入力した数字は正の奇数です。");
		     }
	     
	     }else if(x < 0) {
	    	 
	    	 	if((x % 2) == 0) {
		    	 
			    	 System.out.println("入力した数字は負の偶数です。");
			     }else {
			    	 
			    	 System.out.println("入力した数字は負の奇数です。");
			     }
	    	 
	     }
	}
	
}
