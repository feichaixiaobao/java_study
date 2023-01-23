
/*
#2. 入力------------------------------------------------------------
以降の練習問題を進めるうえで、キーボードから数値や文字列を入力する必要があります。
通常、ユーザーからの入力を正確に得るには入力値のチェックなどの処理が必要ですが、
練習問題ですのでそれらの処理は行わず、ユーザーが要求通りに入力するものとします。

練習問題 2 - 1
String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample2_1 {
    public static void main(String[] args) {
        BufferedReader bufferStr = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferStr.readline();
        System.out.println(s);
    }
}

