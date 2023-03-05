package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 8 - 4
前問で作成したクラスを使用して、次のプログラムを作成しなさい。
・Animal クラスの配列を作成する。要素数は 4。
・配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
・配列の総ての要素の Speak メソッドを実行する。

 */
public class Sample8_4 {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[4];
		
			animals[0] = new DogDD();
			animals[2] = new DogDD();
			
			animals[1] = new Cat2();
			animals[3] = new Cat2();
			
		for(Animal aa: animals) {
			aa.Speak();
		}	
			

	}
	
	
}
