
/*
練習問題 4 - 13
ストライク・カウントを数えるプログラムを作成しなさい。
・１球ごとにストライクかボールかを入力する。
・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
※ストライクの場合は1、ボールの場合は2を入力する。
------------------------------------
ストライク=1 or ボール=2 ？
1
ストライク=1 or ボール=2 ？
2
ストライク=1 or ボール=2 ？
1
ストライク=1 or ボール=2 ？
1
1ボール,3ストライク
------------------------------------
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int strike = 0;
        int ball = 0;

        while ( strike < 3 && ball < 4){
            System.out.println("strike? or ball? (strike=1,ball=2)");
            int x = Integer.parseInt(bufferedInt.readLine());

            if ( x == 1)
                strike++;
            else if ( x == 2)
                ball++;
        }
        System.out.println("strike:" + strike + ";ball:" +ball);
    }
}



