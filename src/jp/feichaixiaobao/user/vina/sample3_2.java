
/*
練習問題 3 - 2
２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("２つの整数値を入力してください：");
        BufferedReader bufferStr = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferStr.readLine());
        int y = Integer.parseInt(bufferStr.readLine());
        if ( x > y)
            System.out.println( x );
        else
            System.out.println( y );
    }
}


