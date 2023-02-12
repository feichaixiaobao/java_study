package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 7
次のプログラムを作成しなさい。
・巨人、阪神戦で毎回の得点を入力する。（１回～９回）
・入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
※試合は巨人の先行とする。
------------------------------------
1回表、巨人の得点は？ 0
1回裏、阪神の得点は？ 0
2回表、巨人の得点は？ 0
2回裏、阪神の得点は？ 1
    ：
    ：
    ：
9回表、巨人の得点は？ 0
9回裏、阪神の得点は？ 1

巨人：5点, 阪神：6点
阪神の勝ち
------------------------------------
 */
public class Sample4_7 {
	
	public static void main(String[] args) {
		
		int kPoint = 0;
		int hPoint = 0;
		int t = 9;
		System.out.println("巨人、阪神戦で毎回の得点を入力する。（１回～"+ t +"回）");
		
		for(int i = 1; i <= t; i++) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println(" " + i +" 回目の巨人、阪神戦得点を入力する。");
			
			kPoint = kPoint + scanner.nextInt();
			hPoint = hPoint + scanner.nextInt();
			
			
		}
		
		
		System.out.println("巨人得点合計" + kPoint);
		System.out.println("阪神得点合計" + hPoint);
		
		if(kPoint > hPoint ) {
			
			System.out.println("巨人勝った！" );
			
		} else if(kPoint < hPoint){
			
			System.out.println("阪神勝った！" );
		}
	}

}
