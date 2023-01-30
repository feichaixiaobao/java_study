package jp.feichaixiaobao.user.uuwen.Sample4;

/*練習問題 4 - 4
7 の階乗を計算し、表示するプログラムを作成しなさい。
 */
public class Sample4_4 {
    public static void main(String[] args) {
        int x = 1;

        for( int i = 7 ; i >= 1 ; i-- )
            x *= i;
            System.out.println( "7! = " + x );
        }
}

