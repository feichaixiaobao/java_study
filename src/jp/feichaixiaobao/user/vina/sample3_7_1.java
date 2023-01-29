
/*
練習問題 3 - 7
試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
・ケース1
    60 点以上：“合格”
    60 点未満：“不合格”
・ケース2
    80 点以上：“たいへんよくできました。”
    60 点以上、80 点未満：“よくできました。”
    60 点未満：“ざんねんでした。”
・ケース3
    80 点以上：“優”
    70 点以上、80 点未満：“良”
    60 点以上、70 点未満：“可”
    60 点未満：“不可”
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_7_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数値を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        if ( x >= 60)
            System.out.println("合格");
        else
            System.out.println("不合格");
    }
}



