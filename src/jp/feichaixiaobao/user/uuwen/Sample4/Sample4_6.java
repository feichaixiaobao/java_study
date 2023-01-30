package jp.feichaixiaobao.user.uuwen.Sample4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
練習問題 4 - 6
整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
 */
public class Sample4_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.println("整数、0 か 1 を 10 回入力する。");
        
        int wins = 0;
            for( int i = 1 ; i <= 10 ; i++ ) {
                System.out.print("第" + i + "回、0か1を入力してください: ");
                int value = Integer.parseInt( br.readLine() );

                if(value == 0 || value == 1 ){
                    if(value == 1){
                        wins ++;
                    }
                } else {
                    System.out.println( "入力が間違っています。" );
                    return;
                }
            }
            System.out.println( "勝ち" + wins + "回"  );
            System.out.println( "負け" + (10 - wins) + "回" );
    }
}
