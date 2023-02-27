package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 7 - 4
前問の Dog クラスに、次の内容を追加しなさい。
・犬種を保持するメンバー変数。（ String 型）
・犬種を設定する引数（ String ）を持つコンストラクタ。
・ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
	修正した Dog クラスを使用して次のプログラムを作成しなさい。
・犬種を指定して Dog クラスのインスタンスを作成する。
・名前、年齢を設定する。
・プロフィールを表示する。
 */
public class Sample7_4 {
	
	public static void main(String[] args) {
		Dog3 d3 = new Dog3("秋田犬");
		d3.SetAge(3);
		d3.SetName("ボビー");
		d3.ShowProfile();
	}

}


class Dog3{
	
	private String Name;
	private int age;
	private String type;
	//犬種を設定する引数（ String ）を持つコンストラクタ
	public Dog3(String tp) {
		
		type = tp;
		
	}
	public void SetName(String nm) {
		
		Name = nm;
	}
	
	public void SetAge(int a) {
		
		age = a;
	}
	

	public void ShowProfile() {
		
		System.out.println("犬種は"+type + "です。" + "名前は" + Name + "です。" + "年齢は" + age + "歳です。");
	}
}
