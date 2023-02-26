package jp.feichaixiaobao.user.yojava;

import java.io.IOException;

/*
 * 練習問題 6 - 6
九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
このメソッドを使用して、九九表を作成しなさい。
 */
public class Sample6_6 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		for(int i = 1; i <= 9; i++ ) {
			
			kuku(i);
		}
	}
	
	//九九のひとつの段を表示するメソッドを作成しなさい。九九のひとつの段を表示するメソッドを作成しなさい。
	public static void kuku(int num) {
		
		for(int i = 1; i <= 9; i++) {
			
				System.out.printf(" %2d" , i * num);
			}
			
			System.out.println();
		}
		
	
}
