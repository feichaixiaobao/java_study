
/*
練習問題 4 - 16
2 以上の数値を入力し、素因数分解した結果を表示しなさい。
例：
------------------------------------
20100
2 2 3 5 5 67
------------------------------------
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4_16 {
    public static void main(String[] args) throws IOException {
        System.out.println("2以上の数値を入力してください:");
        BufferedReader bufferedInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedInt.readLine());

        for (int i = 2; 1 < x ; i++){
            while ( x % i == 0 ){
                System.out.print(i+" ");
                x = x / i;
            }
        }
    }
}



