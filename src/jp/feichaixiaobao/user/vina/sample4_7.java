
/*
練習問題 4 - 7
次のプログラムを作成しなさい。
・巨人、阪神戦で毎回の得点を入力する。（１回～９回）
・入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
※試合は巨人の先行とする。
------------------------------------
1回表、巨人の得点は？ 0
1回裏、阪神の得点は？ 0
2回表、巨人の得点は？ 0
2回裏、阪神の得点は？ 1
    ：
    ：
    ：
9回表、巨人の得点は？ 0
9回裏、阪神の得点は？ 1

巨人：5点, 阪神：6点
阪神の勝ち
------------------------------------
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_7 {
    public static void main(String[] args) throws IOException {
        System.out.println( "巨人、阪神戦で毎回の得点を入力てください：（１回～９回）");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));

        int Giants = 0;
        int Tigers = 0;

        for (int i = 1 ; i < 10 ; i++){
            System.out.println( i + "回表、巨人の得点は:");
            Giants = Giants + Integer.parseInt(bufferedInt.readLine());

            System.out.println( i + "回表、阪神の得点は:");
            Tigers = Tigers + Integer.parseInt(bufferedInt.readLine());
        }

        System.out.println("巨人の得点:" + Giants);
        System.out.println("阪神の得点:" + Tigers);

        if ( Giants > Tigers)
            System.out.println("巨人の勝ち");
        else if ( Giants < Tigers )
            System.out.println("阪神の勝ち");
        else
            System.out.println("引き分け");
    }
}





