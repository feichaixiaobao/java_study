package jp.feichaixiaobao.user.uuwen.Sample6;

/*
２つの整数の大きい方を選ぶメソッドを作成しなさい。２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        
        System.out.println("数値を入力してください");
        System.out.print("a: ");
        int a = Integer.parseInt( br.readLine() );
        System.out.print("b: ");
        int b = Integer.parseInt( br.readLine() );
        System.out.print("c: ");
        int c = Integer.parseInt( br.readLine() );

        System.out.println("最大値:"+ bigger(a,bigger(b,c)));
    }

    public static int bigger(int x, int y) {
        if(x > y){
            return x;
        }
        return y;
    }
}
