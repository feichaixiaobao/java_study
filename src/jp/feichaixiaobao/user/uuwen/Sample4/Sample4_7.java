package jp.feichaixiaobao.user.uuwen.Sample4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
練習問題 4 - 7
次のプログラムを作成しなさい。

巨人、阪神戦で毎回の得点を入力する。（１回～９回）
入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
※ 	試合は巨人の先行とする。
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
public class Sample4_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.println("巨人、阪神戦で毎回の得点を入力する。（１回～９回）");

        int giantsScore = 0;
        int tigersScore = 0;

        for(int i = 1 ; i <= 9 ; i ++){

            System.out.print(i + "回表、巨人の得点は: ");
            int giants = Integer.parseInt( br.readLine() );
            giantsScore += giants ;

            System.out.print(i + "回表、阪神の得点は: ");
            int tigers  = Integer.parseInt( br.readLine() );
            tigersScore += tigers;
        }
        System.out.println("巨人: " + giantsScore + "点," + "阪神: " + tigersScore + "点");

        if (giantsScore > tigersScore) {
			System.out.println("巨人の勝ち");
		} else if (giantsScore < tigersScore) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}

    }
}
