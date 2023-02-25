package jp.feichaixiaobao.user.yojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 5 - 4
数値を繰り返して入力し、合計が 100 を超えた場合、または入力が 10 回行われた場合、入力を止め入力された数値をすべて表示するプログラムを作成しなさい。

 */
public class Sample5_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	System.out.println("10 number input" );
	int values[] = new int[10];
	int cnt = 0,sum = 0;
		
		while( cnt < 10 && sum <= 100 )	{
			    values[cnt] =Integer.parseInt(br.readLine());
			    sum += values[cnt++];
			}
	
		for(int i = 0;i < cnt; i++) {
			
			System.out.println("\n" + values[i]);
		}
	
	}
}


