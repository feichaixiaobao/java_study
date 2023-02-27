package jp.feichaixiaobao.user.yojava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 練習問題 7 - 6
前問の CoinCase クラスに、次の内容を追加しなさい。
・総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。
・指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。

修正した CoinCase クラスを使用して次のプログラムを作成しなさい。
・CoinCase クラスのインスタンスを作成する。
・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
・各硬貨が何枚でいくらあるかを表示する。
・硬貨の総枚数を表示する。
・総額を表示する。
 */
public class Sample7_6 {
	
	CoinC cc2 = new CoinC();
	
	BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
	
	for(int i = 0; i < 10; i ++) {
		System.out.print( "硬貨の種類は?" );
		int y = Integer.parseInt(br2.readLine());
		System.out.print( "硬貨の枚数は?" );
		int c = Integer.parseInt(br2.readLine());
		
		cc2.AddC(y, c);
	}
	//各硬貨が何枚でいくらあるかを表示する。
	System.out.println("500Yenは" + cc2.getCou(500) + "枚です。");
	System.out.println("100Yenは" + cc2.getCou(100) + "枚です。");
	System.out.println("50Yenは" + cc2.getCou(50) + "枚です。");
	System.out.println("10Yenは" + cc2.getCou(10) + "枚です。");
	System.out.println("5Yenは" + cc2.getCou(5) + "枚です。");
	System.out.println("1Yenは" + cc2.getCou(1) + "枚です。");
	//・硬貨の総枚数を表示する。
	System.out.println("硬貨は" + cc2.getCountTotal() + "枚です。");
	//総額を表示する。
	System.out.println("総額は" + cc2.getAmount2(500) + cc2.getAmount2(100) + cc2.getAmount2(50) + cc2.getAmount2(10)
	 + cc2.getAmount2(10) + cc2.getAmount2(5) + cc2.getAmount2(1)+ "円です。");
	
	
}

	//・AddCoins メソッドで硬貨を追加する。
	//・引数は硬貨の種類（ int ）と枚数（ int ）。
class CoinC{
	
	private int Yen500;
	private int Yen100;
	private int Yen50;
	private int Yen10;
	private int Yen5;
	private int Yen1;
	
	public void AddC(int y, int c) {
		
		switch(y) {
		
		case 500:
			
			Yen500 += c;
			break;
		case 100:
			
			Yen100 += c;
			break;
		case 50:
			
			Yen50 += c;
			break;
		case 10:
			
			Yen10 += c;
			break;
		case 5:
			
			Yen5 += c;
			break;
		case 1:
			
			Yen1 += c;
			break;
		}
	}
		//・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
		//・引数は硬貨の種類（ int ）、戻り値は枚数（ int ）
		public int getCou(int y){
			
			switch(y) {
			
			case 500:
				return 	Yen500;
			case 100:
				return 	Yen100;
			case 50:
				return 	Yen50;
			case 10:
				return 	Yen10;
			case 5:
				return 	Yen5;
			case 1:
				return 	Yen500;
				
			}
			
			return 0;
		}
		//・総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。

		public int getCountTotal(){
			
			return Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1;
		}
		
		//・指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。
		
		public int getAmount2(int y) {
			
			return getCou(y) * y;
		}
	}
	
	
}
