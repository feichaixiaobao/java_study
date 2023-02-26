package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 16
//        2 以上の数値を入力し、素因数分解した結果を表示しなさい。
//        例：
//        ------------------------------------
//        20100
//        2 2 3 5 5 67
//        ------------------------------------
public class sample4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 2 以上の数値を入力してください：");
        int n = sc.nextInt();
        for( int x = 2 ; n > 1 ; x++ ){
            while( ( n % x ) == 0 ){
                System.out.print( x + " " );
                n /= x;
            }
    }
    }
}
