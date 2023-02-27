package jp.feichaixiaobao.user.yojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 7 - 5
硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
・500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。

・AddCoins メソッドで硬貨を追加する。
・引数は硬貨の種類（ int ）と枚数（ int ）。

・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
・引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。

・GetAmount メソッドで硬貨の総額を取得する。
・戻り値は硬貨の総額( int )。

CoinCase クラスを使用して次のプログラムを作成しなさい。
・CoinCase クラスのインスタンスを作成する。
・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
・各硬貨が何枚あるかを表示する。
・総額を表示する。
※硬貨の種類は 500 円なら整数の 500、100 円なら 100 とし、該当しない数が指定された場合には無視する。
 */
public class Sample7_5 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		CoinCase cc = new CoinCase();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int type = 0;
		int qty = 0;
		//・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
		for(int i = 0; i < 9; i ++) {
			System.out.print( "硬貨の種類は?" );
			type = Integer.parseInt(br.readLine());
			System.out.print( "硬貨の枚数は?" );
			qty = Integer.parseInt(br.readLine());
			cc.addCoins(type, qty);
			
		}
		//各硬貨が何枚あるかを表示する。
		 System.out.println( "500円は" +  cc.getCount( 500 ) + "枚");
		 System.out.println( "100円は" +  cc.getCount( 100 ) + "枚");
		 System.out.println( "50円は" +  cc.getCount( 50 ) + "枚");
		 System.out.println( "10円は" +  cc.getCount( 10 ) + "枚");
		 System.out.println( "5円は" +  cc.getCount( 5 ) + "枚");
		 System.out.println( "1円は" +  cc.getCount( 1 ) + "枚");
		 
		 //・総額を表示する。
		 System.out.println( "総額は" +  cc.getAmount() + "円");
		
		}
}

class CoinCase{
	
	private int Y500 = 0;
	private int Y100 = 0;
	private int Y50 = 0;
	private int Y10 = 0;
	private int Y5 = 0;
	private int Y1 = 0;
	
	//・AddCoins メソッドで硬貨を追加する。
	//・引数は硬貨の種類（ int ）と枚数（ int ）。
	public  void addCoins(int k,int c){
		
		switch(k) {
			
			case 500:
			
				Y500 +=c;
				break;
			
			case 100:
				Y100 += c;
				break;
				
			case 50:
				Y50 +=c;
				break;
			
			case 10:
				Y10 += c;
				break;
			
			case 5:
				Y5 += c;
				break;
			case 1:
				Y1 += c;
		}
		
		
	}
	//・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
	//・引数は硬貨の種類（ int ）、戻り値は枚数（ int ）
	public  int getCount(int k) {
		
		switch(k) {
				
			case 500:
			
				return Y500;
				
			case 100:
				return Y100;
				
			case 50:
				return Y50;
				
			case 10:
				return Y10;
				
			case 5:
				return Y5;
				
			case 1:
				return Y1;
			}
		return 0;
			
		
	}
	//・GetAmount メソッドで硬貨の総額を取得する。
	//・戻り値は硬貨の総額( int )。
	public  int getAmount() {
		
		return (500 * Y500 + 100 * Y100 + 50 * Y50 +10 * Y10 +5 * Y5 +1 * Y1);
	}
}
