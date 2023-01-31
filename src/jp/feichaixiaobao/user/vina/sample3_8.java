
/*
練習問題 3 - 8
中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
・両方とも60 点以上の場合、合格
・合計が130 点以上の場合、合格
・合計が100 点以上で、どちらかの試験が 90 点以上であれば合格
・上記以外は不合格
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_8 {
    public static void main(String[] args) throws IOException {
        System.out.println("中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        int y = Integer.parseInt(bufferInt.readLine());
        if ( x >= 60 && y >= 60 )
            System.out.println("合格");
        else if ( ( x + y ) >= 130 )
            System.out.println("合格");
        else if ( ( x + y ) >= 100 && ( x >= 90  ||  y >= 90 ))
            System.out.println("合格");
        else
            System.out.println("不合格");
    }
}



