package jp.feichaixiaobao.user.yuuya.sample4;

// 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、
// 0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。

public class sample4_6 {
	public static void main(String[] args) {
		
		//xを負け、ｙを勝ちとする
		int x = 0;
		int y = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("整数、0 か 1 を 10 回入力");
		
		for(int i = 0; i < 10; i++) {
			int n = s.nextInt();
			
			if (n == 0) {
				x++;
			} else {
				y++;
			}
		}
		
		System.out.println("勝ちの総数: " + y);
		System.out.println("負けの総数: " + x);
	}
}
