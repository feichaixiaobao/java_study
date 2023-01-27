
/*
練習問題 3 - 4
int 型の変数 x、y にそれぞれ数値を入力し、
x が ｙ より大きい場合には“xはyより大きい”、
x が y より小さい場合には“xはyより小さい”、
x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("int 型の変数 x、y にそれぞれ数値を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        int y = Integer.parseInt(bufferInt.readLine());
        if ( x > y )
            System.out.println("xはyより大きい");
        else if ( x < y )
            System.out.println("xはyより小さい");
        else
            System.out.println("xとyは等しい");
    }
}



