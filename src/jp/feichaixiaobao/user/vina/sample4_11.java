
/*
練習問題 4 - 11
個数を示す数値を入力し、
その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
例：
14
01234567890123
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_11 {
    public static void main(String[] args) throws IOException {
        System.out.println("個数を示す数値を入力してください：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedInt.readLine());

        for (int i = 0 , x = 0 ; i < count ; i++){

            System.out.print(x++);

            if ( x > 9)
                x = 0;
        }
    }
}



