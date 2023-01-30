package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*練習問題 4 - 21
サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
・サイズ 3 の例
------------------------------------
X X
 X
X X
------------------------------------

・サイズ 4 の例
------------------------------------
X  X
 XX
 XX
X  X
------------------------------------

・サイズ 5 の例
------------------------------------
X   X
 X X
  X
 X X
X   X
------------------------------------ */
public class Sample4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値を入力：");
        int value = sc.nextInt();

        for(int i = 0 ; i < value ; i++){
            for(int j = 0 ; j < value ; j++ ){
                if( i == j || (value - i - 1 ) == j ){
                    System.out.print( "X" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println(" ");
        }
    }   
}

