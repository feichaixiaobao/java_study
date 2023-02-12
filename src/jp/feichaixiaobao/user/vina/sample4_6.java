
/*
練習問題 4 - 6
整数、0 か 1 を 10 回入力する。
これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_6 {
    public static void main(String[] args) throws IOException {
        System.out.println( "整数、0 か 1 を 10 回入力して下さい：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int x = 0 ;

        for ( int i = 0 ; i < 10 ; i++) {
            int y = Integer.parseInt(bufferedInt.readLine());
            if ( y == 1)
                x = x + 1; // x += 1
        }

        System.out.println( "勝ちの総数:" + x + ";負けの総数:" + (10-x));
    }
}





