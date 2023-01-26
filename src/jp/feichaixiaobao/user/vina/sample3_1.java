
/*
#3. 分岐-----------------------------------------------------------------
練習問題 3 - 1
int 型の変数 x、y にそれぞれ数値を入力し、
x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("int 型の変数 x、y にそれぞれ数値を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        int y = Integer.parseInt(bufferInt.readLine());
        if ( x > y) System.out.println("xはyより大きい。");
    }
}

