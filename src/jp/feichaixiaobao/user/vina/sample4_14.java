
/*
練習問題 4 - 14
前の問題に次の修正を加えなさい。
・１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
・ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_14 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int strike = 0;
        int ball = 0;

        while ( strike < 3 && ball < 4){

            System.out.println("strike? or ball? or fullball? (strike=1,ball=2,fullball=3)");

            int score = Integer.parseInt(bufferedInt.readLine());

            if ( score == 1)
                strike++;
            else if ( score == 2)
                ball++;
            else if ( score == 3 && strike < 2)
                strike++;
        }

        System.out.println("strike:" + strike + ";ball:" +ball);
    }
}



