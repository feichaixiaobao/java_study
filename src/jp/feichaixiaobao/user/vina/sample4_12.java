
/*
練習問題 4 - 12
数値を繰り返し入力し、
合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_12 {
    public static void main(String[] args) throws IOException {
        System.out.println("数値を繰り返し入力してください：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while ( sum <= 100)
            sum += Integer.parseInt(bufferedInt.readLine());

        System.out.println(sum);
    }
}



