
/*
練習問題 4 - 8
自然数（正の整数）を 10 回入力し、
最大値を求めるプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_8 {
    public static void main(String[] args) throws IOException {
        System.out.println("自然数（正の整数）を 10 回入力てください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int maxInt = 0;

        for ( int i = 1 ; i <= 10 ; i++) {
            int x = Integer.parseInt(bufferInt.readLine());
            if ( maxInt < x)
                maxInt = x;
        }
        System.out.println( "最大値:" + maxInt);
    }
}





