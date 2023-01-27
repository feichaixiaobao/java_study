
/*
練習問題 3 - 5
正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
※奇数、偶数の判定には除算の余りを利用する。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("正の整数値を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        if ( x % 2 == 0)
            System.out.println("偶数");
        else
            System.out.println("奇数");
    }
}



