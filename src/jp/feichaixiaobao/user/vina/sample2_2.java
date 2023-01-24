
/*
練習問題 2 - 2
int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        System.out.println(x);
    }
}

