package jp.feichaixiaobao.user.uuwen.Sample7;

/*硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
・500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
・AddCoins メソッドで硬貨を追加する。
・引数は硬貨の種類（ int ）と枚数（ int ）。
・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
・引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
・GetAmount メソッドで硬貨の総額を取得する。
・戻り値は硬貨の総額( int )。

CoinCase クラスを使用して次のプログラムを作成しなさい。
・CoinCase クラスのインスタンスを作成する。
・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
・各硬貨が何枚あるかを表示する。
・総額を表示する。
※硬貨の種類は 500 円なら整数の 500、100 円なら 100 とし、該当しない数が指定された場合には無視する。 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample7_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.println("10回入力してください");
        CoinCase coinCase = new CoinCase();
        for(int i = 1 ; i < 11 ; i ++){
            System.out.print( "第" + i + " 回、硬貨の種類は？ ");
            int kind = Integer.parseInt(br.readLine());
            System.out.print("硬貨の枚数は？ ");
            int count = Integer.parseInt(br.readLine());
            coinCase.AddCoins(kind, count);
        }
        int total = 0;
        System.out.println( "500円は" + coinCase.GetCount( 500 ) + "枚" );
        System.out.println( "100円は" + coinCase.GetCount( 100 ) + "枚" );
        System.out.println( "50円は" + coinCase.GetCount( 50 ) + "枚" );
        System.out.println( "10円は" + coinCase.GetCount( 10 ) + "枚" );
        System.out.println( "5円は" + coinCase.GetCount( 5 ) + "枚" );
        System.out.println( "1円は" + coinCase.GetCount( 1 ) + "枚" );
        System.out.println( "総額は" + coinCase.GetAmount(total) + "円" );
    }
}


