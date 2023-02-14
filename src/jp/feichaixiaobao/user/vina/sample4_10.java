
/*
練習問題 4 - 10
個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_10 {
    public static void main(String[] args) throws IOException {
        System.out.println("個数を示す数値を入力してください：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedInt.readLine());

        for (int i = 0 ; i < x ; i++)
            System.out.println("*");
    }
}




