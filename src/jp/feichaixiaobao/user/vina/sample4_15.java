
/*
練習問題 4 - 15
入力された数が素数かどうかを判定するプログラムを作成しなさい。
※判定する数は 4 以上としてよい。

*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_15 {
    public static void main(String[] args) throws IOException {
        System.out.println("4より大きい自然数を入力してください：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedInt.readLine());

        boolean isPrime = true;
        for (int i = 2 ; i <= x / 2 ; i++ ){
            if ( x % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(x+"は素数");
        else
            System.out.println(x+"は素数ではありません");
    }
}



