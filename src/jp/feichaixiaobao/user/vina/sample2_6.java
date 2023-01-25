
/*
練習問題 2 - 6
年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
※日数の計算は閏年等を考慮せず、年齢×365とする。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample2_6 {
    public static void main(String[] args) throws IOException {
        System.out.println("年齢を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        System.out.println("生まれてから現在までのおおよその日数は:" + ( 365 * x ));
    }
}
