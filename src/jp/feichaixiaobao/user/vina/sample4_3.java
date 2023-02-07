
/*
練習問題 4 - 3
2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

public class sample4_3 {
    public static void main(String[] args) {
        int x = 1;
        for ( int n = 1 ; n <=8 ; n++){
            x = 2 * x; // x *= 2
            System.out.println( "2 の" + n + "乗:" + x);
        }
    }
}





