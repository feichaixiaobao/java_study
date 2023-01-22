
/*
練習問題 1 - 12
int 型の変数 x に任意の数値を代入し、インクリメント演算子、
デクリメント演算子を適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。

注釈：
インクリメント【increment】inc
インクリメントとは、増加、増分などの意味の英単語だが、
コンピュータでは数値に1を加える操作のことを指す。逆に1を減じる操作は「デクリメント」（decrement）という。
*/

package jp.feichaixiaobao.user.vina;

public class sample1_12 {
    public static void main(String[] args) {
        int x = 100 ;
        x ++ ;
        System.out.println("インクリメント演算子:" +x );
        x -- ;
        x -- ;
        System.out.println("デクリメント演算子:" +x );
    }
}
