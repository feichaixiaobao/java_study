
/*
練習問題 2 - 5
２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
※計算は整数で行い、小数点以下は切り捨ててよい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample2_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("２つの整数値を入力してください:");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        int y = Integer.parseInt(bufferInt.readLine());
        System.out.println("平均値:" + (( x + y ) / 2 ));
    }
}
