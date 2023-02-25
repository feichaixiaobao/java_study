package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 5 - 3
次のプログラムを作成しなさい。
・10 個の数値を入力する。
・入力された数値を偶数と奇数に分類して表示する。
表示例：
------------------------------------
偶数：42 54 32 8
奇数：7 35 71 13 21 45
------------------------------------
 */
public class Sample5_3 {
	

	public static void main(String[] args) {
		
			
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("10個数値を入力してください。");
			int[] nums = new int[10];
			
			for(int i = 0;i < 10; i++) {
				nums[i] =scanner.nextInt();
			}
			
			System.out.print( "偶数：" + " " );
			for(int i = 0; i < 10; i ++) {
				
				if((nums[i] % 2 )== 0 ) {
					
					System.out.print( nums[i] + " " );
							
				}
			}
			System.out.println(" " );
			System.out.print( "奇数：" + " " );
			for(int num : nums) {
				
				if((num % 2) != 0) {
					
					System.out.print( num + " " );	
				}
			}
		}
	}


}
