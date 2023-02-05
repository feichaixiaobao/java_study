
/*
練習問題 3 - 12
好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
※switch 文を使用する。
※選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
※題材は鮨でなくても良い。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_12 {
    public static void main(String[] args) throws IOException {
        System.out.println( "お好きな寿司を選んでください:" );
        System.out.println( "(1:まぐろ 2:えび 3:こはだ)" );
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());

        switch(x){
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("小吉");
                break;
        }
    }
}



