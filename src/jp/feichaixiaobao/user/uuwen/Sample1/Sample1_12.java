package jp.feichaixiaobao.user.uuwen.Sample1;
/*
練習問題 1 - 12
int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を適用して結果を表示することにより
演算子の効果を確認するプログラムを作成しなさい。
 */
public class Sample1_12 {

	public static void main(String[] args) {
		int x = 15;
		x++;
		System.out.println("インクリメント演算子 = " + x );
		
		x-- ;/*15にする*/
		x-- ;
		System.out.println("デクリメント演算子 = " + x );
	}

}
