
/*
練習問題 4 - 18
数値を繰り返して入力し、
0 が入力されたら入力を止め、
それまでの合計を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_18 {
    public static void main(String[] args) throws IOException {
        System.out.println("数値を繰り返して入力してください：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for ( ; ; ){
            int x = Integer.parseInt(bufferedInt.readLine());
            if (x == 0)
                break;
            sum += x;
        }
        System.out.println("合計:"+sum);
    }
}



