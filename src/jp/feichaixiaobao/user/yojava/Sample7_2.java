package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 7 - 2
前問の Dog クラスに、次の内容を追加しなさい。
・年齢を保持する int 型のメンバー変数。
・年齢を設定するメンバー・メソッド、SetAge。
・ShowProfile メソッドで名前、年齢を表示するようにする。

修正した Dog クラスを使用して次のプログラムを作成しなさい。
・Dog クラスのインスタンスを作成する。
・名前、年齢を設定する。
・プロフィールを表示する。
 */
public class Sample7_2 {

	public static void main(String[] args) {	
		Dog2 d2 = new Dog2();
		d2.SetName( "ハッピー");
		d2.SetAge(2);
		d2.ShowProfile();
	}
}


class Dog2{
	
	private String Name;
	private int age;
	
	public void SetName(String nm) {
		
		Name = nm;
	}
	
	public void SetAge(int a) {
		
		age = a;
//		return age;
	}
	public void ShowProfile() {
		
		System.out.println("名前は" + Name + "です。" + "年齢は" + age + "歳です。");
	}
}
