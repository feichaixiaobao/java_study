
/*
練習問題 4 - 5
整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
※計算は整数で行い、小数点以下は切り捨ててよい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数を 10 回入力してください：");
        int sum = 0;
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));

        for ( int i = 0 ; i < 10 ; i++){
            int x = Integer.parseInt(bufferedInt.readLine());
            sum = sum + x; // sum += x
        }

        System.out.println("平均値:" + ( sum/10 ));
    }
}






