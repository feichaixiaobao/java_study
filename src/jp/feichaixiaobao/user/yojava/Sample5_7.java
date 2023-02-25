package jp.feichaixiaobao.user.yojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 5 - 7
1 桁の数値（ 1 ～ 9 に限定）を２つ入力し、その積を表示するプログラムを作成しなさい。
ただし、九九の計算結果が入った配列を予め作成して利用すること。（前問を参考に）
 */
public class Sample5_7 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kuku[][] = new int[9][9]; 
		
		for(int i = 0; i < 9; i ++) {
			
			for(int j = 0; j < 9; j++) {
				
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(kuku[a - 1][b - 1]);
		
	}

}
