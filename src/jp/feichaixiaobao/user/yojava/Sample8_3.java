package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 8 - 3
前問の Animal クラスに以下のメンバー・メソッドを追加しなさい。
------------------------------------
public void Speak()
{
    System.out.println( "......" );
}
------------------------------------
Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。

次のプログラムを作成しなさい。
・Cat クラスと Dog クラスのインスタンスを作成する。
・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
・それぞれの ShowProfile を実行する。
・それぞれの Speak を実行する。
 */
public class Sample8_3 {
	
	public static void main(String[] args) {
		
		DogDD d2 = new DogDD();
		d2.Name = "福";
		d2.Age = 8;
		d2.ShowProfile();
		d2.Speak();
		
		
		Cat2 c3 = new Cat2();
	
		
		c3.Name = "山";
		c3.Age = 7;
		c3.ShowProfile();
		c3.Speak();
		
	}

}

class Cat2 extends Animal{
	
	public void Speak() {
		
		System.out.println("ニャー");
	}
}
class DogDD extends Animal{
	
	public void Speak() {
		
		System.out.println("ワンワン");
	}
}
