package jp.feichaixiaobao.user.uuwen.Sample5;

import java.util.Arrays;
import java.util.Scanner;

/*
練習問題 5 - 8
整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。
 */
public class Sample5_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("数値を 10 回入力する。");
        int value[] = new int[10];

        for(int i = 0 ; i < 10 ; i ++){
            System.out.print("数値を入力してください： ");
            value[i] = sc.nextInt();
        }
        System.out.println("配列value[]= " + Arrays.toString(value));
        
        for( int i = 0 ; i < 10 ; i++ ){
            for( int j = i + 1 ; j < 10 ; j++ ){
                if( value[i] > value[j] ){
                    int a = value[i];
                    value[i] = value[j];
                    value[j] = a;
                }
            }
        }

        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( value[i] + " " );
        }
	}

}
