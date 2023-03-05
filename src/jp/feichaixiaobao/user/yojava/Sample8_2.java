package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 8 - 2
前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
・Dog はメンバー・メソッドRunを持つ。
　Run を実行すると“トコトコ”という文字列を表示する。
 
次のプログラムを作成しなさい。
・Cat クラスと Dog クラスのインスタンスを作成する。
・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
・それぞれの ShowProfile を実行する。
・Cat のインスタンスの Sleep を実行する。
・Dog のインスタンスの Run を実行する。
 */
public class Sample8_2 {
	
	public static void main(String[] args) {
		
		Cat c2 = new Cat();
		DogD d1 = new DogD();
		
		c2.Name = "C2";
		c2.Age = 5;
		c2.ShowProfile();
		c2.sleep();
		
		d1.Name = "D1";
		d1.Age = 6;
		d1.ShowProfile();
		d1.run();
		
	}
}

class DogD extends Animal{
	
	public void run() {
		System.out.println("トコトコ");
	}
}
