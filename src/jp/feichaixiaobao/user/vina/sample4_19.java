
/*
練習問題 4 - 19
数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
※最後に入力された 0 は平均に含めない。
※少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_19 {
    public static void main(String[] args) throws IOException {
        System.out.println("数値を繰り返して入力してください：");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;

        for ( ; ; ){
            int x = Integer.parseInt(bufferedInt.readLine());
            if (x == 0)
                break;
            sum += x;
            count ++;
        }
        System.out.println("平均値:"+ (sum / count));
    }
}


