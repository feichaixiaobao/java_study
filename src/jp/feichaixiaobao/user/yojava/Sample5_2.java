package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 5 - 2
次のプログラムを作成しなさい。
・10 個の数値を入力する。
・入力された順番と逆の順番で 10 個の数値を表示する。
 */
public class Sample5_2 {
	

	public static void main(String[] args) {
		
		int max;
		int min;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println( "数値　10回入力してください。" );
		int[] nums = new int[10];
		
		for(int i = 0;i < 10; i++) {
			nums[i] =scanner.nextInt();
		}
		
		for(int j = 9; j > 0; j--) {
			
			for(int i = 0; i < j; i ++) {
				
				if(nums[i] > nums[i + 1]) {
					max = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = max;
					
				}
				//System.out.println( nums[i] );
			}
		}
		for(int i = 0; i < 10; i ++) {
			System.out.print( nums[i] + " " );
		}
		
		System.out.println( );
		
		for(int j = 9; j > 0; j--) {
			
			for(int i = 0; i < j; i ++) {
				
				if(nums[i] < nums[i + 1]) {
					min = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = min;
					
				}
				//System.out.println( nums[i] );
			}
		}
		for(int i = 0; i < 10; i ++) {
			System.out.print( nums[i]  + " "  );
		}
	}

}
