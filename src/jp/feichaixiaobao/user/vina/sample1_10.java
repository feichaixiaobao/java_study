
/*
練習問題 1 - 10
int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

public class sample1_10 {
    public static void main(String[] args) {
        int x = 100 ;
        System.out.println( x );
        System.out.println( x * x );
        System.out.println( x * x * x );
        System.out.println( Math.pow( x , 1 ) );
        System.out.println( Math.pow( x , 2 ) );
        System.out.println( Math.pow( x , 3 ) );
    }
}
