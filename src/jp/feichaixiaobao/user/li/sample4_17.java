package jp.feichaixiaobao.user.li;
//
//練習問題 4 - 17
//        九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//        ※System.out.printfを使用する。System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。
public class sample4_17 {
    public static void main(String[] args) {
        for(int p = 1 ; p < 10 ; p++){
            for ( int q = 1 ; q < 10; q++){
                System.out.printf(" %2d", p * q );
            }
            System.out.println();
            }
        }
    }

