package jp.feichaixiaobao.user.yojava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 5 - 8
整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。
 */
public class Sample5_8 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			
			n[i] = Integer.parseInt( br.readLine());
		}
		
		for(int i = 0; i < 10;i++) {
			
			for(int j = i + 1; j < 10; j++) {
				
				if(n[i] > n[j]) {
					
					int big = n[i];
					n[i] = n[j];
					n[j] = big;
				}
			}
			
		}
		
		for( int i = 0 ; i < 10 ; i++ )
			
		    System.out.print( n[i] + " " );
	}

}
