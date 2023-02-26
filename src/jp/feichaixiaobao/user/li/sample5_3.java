package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 5 - 3
//        次のプログラムを作成しなさい。
//        ・10 個の数値を入力する。
//        ・入力された数値を偶数と奇数に分類して表示する。
//        表示例：
//        ------------------------------------
//        偶数：42 54 32 8
//        奇数：7 35 71 13 21 45
//        ------------------------------------
public class sample5_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0;i < 10;i++){
            System.out.println("数値を入力してください：");
            a[i] = sc.nextInt();
        }
        System.out.print( "\n偶数：" );
        for( int n : a )
            if( ( n % 2 ) == 0 )
                System.out.print( n + " " );
        System.out.print( "\n奇数：" );
        for( int n : a )
            if( ( n % 2 ) != 0 )
                System.out.print( n + " " );
    }
}
