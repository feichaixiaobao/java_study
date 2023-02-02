
/*
練習問題 3 - 10
整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。
・x は y より小さく、かつ、x と y は共に偶数である。
・x と y は等しく、かつ、負の数である。
・x は y より小さい、または、x は偶数である。
・x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
・x も y も負の数である、ではない。（ x も y も負の数である、の否定）
--------------------------------------------------
if( ～ 条件 ～ )
    System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

if( ～ 条件 ～ )
    System.out.println( "xとyは等しく、かつ、負の数である。" );

if( ～ 条件 ～ )
    System.out.println( "xはyより小さい、または、xは偶数である。" );

if( ～ 条件 ～ )
    System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

if( ～ 条件 ～ )
    System.out.println( "xもyも負の数である、ではない。" );
--------------------------------------------------
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_10 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数値 x, y を入力してください：");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        int y = Integer.parseInt(bufferInt.readLine());

        if( x < y && ( x % 2 == 0 ) &&  ( y % 2 == 0 ))
            System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

        if( x == y && x < 0 )
            System.out.println( "xとyは等しく、かつ、負の数である。" );

        if( x < y || ( x % 2 ) == 0  )
            System.out.println( "xはyより小さい、または、xは偶数である。" );

        if( ( x <= 10 || x >= 100 ) && ( 10 <= y && y <= 100) )
            System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

        if( ! (x < 0 && y < 0 ) ) //取反
            System.out.println( "xもyも負の数である、ではない。" );
    }
}



