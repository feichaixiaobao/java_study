
/*
練習問題 4 - 9
整数を 10 回入力し、
最大値と最小値を求めるプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_9 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数を 10 回入力てください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int maxInt = 0;
        int minInt = 0;
        for ( int i = 1 ; i <=10 ; i++ ){
            int value = Integer.parseInt(bufferInt.readLine());
            if ( i == 1 ){ //第一次输入
                maxInt = value;
                minInt = value;
            }else {
                if ( value > maxInt)
                    maxInt = value;
                if ( value < minInt)
                    minInt = value;
            }
        }

        System.out.println("最大値:" + maxInt);
        System.out.println("最小値" + minInt);
    }
}




