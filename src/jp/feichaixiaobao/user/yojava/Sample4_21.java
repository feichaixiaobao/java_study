package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 21
サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
・サイズ 3 の例
------------------------------------
X X
 X
X X
------------------------------------

・サイズ 4 の例
------------------------------------
X  X
 XX
 XX
X  X
------------------------------------

・サイズ 5 の例
------------------------------------
X   X
 X X
  X
 X X
X   X
------------------------------------
 */
public class Sample4_21 {
	
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Xのサイズを入力してください。");
		
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i ++) {
			
			for(int j = 1; j <= num; j++) {
				
				if(i == j || (num - i + 1) == j) {
					
					System.out.print("X");
					
				}else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
//		for(int i = 0; i < num; i ++) {
//			
//			for(int j = 0; j < num; j++) {
//				
//				if(i == j || (num - i - 1) == j) {
//					
//					System.out.print("X");
//					
//				}else {
//					
//					System.out.print(" ");
//				}
//			}
//			
//			System.out.println();
//		}
		
	}

}
