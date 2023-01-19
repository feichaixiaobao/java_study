package jp.feichaixiaobao.user.yuuya;

/**
 * 練習問題 1 - 7
 * int 型の変数 x、y に任意の数値を代入し、
 * x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。
 * ※xとy以外に、もうひとつ変数が必要となる。
 */
public class sample1_7 {
	public static void main(String[] args) {
		int x = 13;
		int y = 17;
		System.out.println("x=" + x + ",y=" + y);
		int z = x;
		x = y;
		y = z;
		System.out.println("x=" + x + ",y=" + y);
	}
}
