package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 7 - 3
前問の Dog クラスを使用して次のプログラムを作成しなさい。
・Dog クラスのインスタンスを２つ作成する。
・１つ目のインスタンスに、名前、年齢を設定する。
・２つ目のインスタンスに、名前、年齢を設定する。
・１つ目のインスタンスの、プロフィールを表示する。
・２つ目のインスタンスの、プロフィールを表示する。
 */
public class Sample7_3 {
	
	public static void main(String[] args) {
		
		Dog2 d1 = new Dog2();
		d1.SetAge(2);
		d1.SetName("天才");
		
		Dog2 d2 = new Dog2();
		d2.SetAge(3);
		d2.SetName("太陽");
		
		d1.ShowProfile();
		d2.ShowProfile();
	}
}


