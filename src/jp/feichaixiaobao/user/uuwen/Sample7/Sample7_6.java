package jp.feichaixiaobao.user.uuwen.Sample7;
/*前問の CoinCase クラスに、次の内容を追加しなさい。
・総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。
・指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。

修正した CoinCase クラスを使用して次のプログラムを作成しなさい。
・CoinCase クラスのインスタンスを作成する。
・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
・各硬貨が何枚でいくらあるかを表示する。
・硬貨の総枚数を表示する。
・総額を表示する。 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample7_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.println("10回入力してください");
        CoinCase coinCase = new CoinCase();
        for(int i = 1 ; i < 11 ; i ++){
            System.out.print( "第" + i + "回、硬貨の種類は？ ");
            int kind = Integer.parseInt(br.readLine());
            System.out.print("硬貨の枚数は？ ");
            int count = Integer.parseInt(br.readLine());
            coinCase.AddCoins(kind, count);
        }
        int total = 0;
        System.out.println( "500円は" + coinCase.GetCount( 500 )+ "枚、" + coinCase.GetAmount2( 500 ) + "円" );
        System.out.println( "100円は" + coinCase.GetCount( 100 )+ "枚、" + coinCase.GetAmount2( 100 ) + "円" );
        System.out.println( "50円は" + coinCase.GetCount( 50 ) + "枚、" + coinCase.GetAmount2( 50 ) + "円" );
        System.out.println( "10円は" + coinCase.GetCount( 10 )+ "枚、" + coinCase.GetAmount2( 10 ) + "円" );
        System.out.println( "5円は" + coinCase.GetCount( 5 )+ "枚、" + coinCase.GetAmount2( 5 ) + "円" );
        System.out.println( "1円は" + coinCase.GetCount( 1 )+ "枚、" + coinCase.GetAmount2( 1 ) + "円" );
        System.out.println( "全部で" + coinCase.GetCount2() + "枚" );
        System.out.println( "総額は" + coinCase.GetAmount(total) + "円" );

    }
}

