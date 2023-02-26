package jp.feichaixiaobao.user.li;
//練習問題 7 - 4
//        前問の Dog クラスに、次の内容を追加しなさい。
//        ・犬種を保持するメンバー変数。（ String 型）
//        ・犬種を設定する引数（ String ）を持つコンストラクタ。
//        ・ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
//
//        修正した Dog クラスを使用して次のプログラムを作成しなさい。
//        ・犬種を指定して Dog クラスのインスタンスを作成する。
//        ・名前、年齢を設定する。
//        ・プロフィールを表示する。

class Dog_kind
{
    private String Name;
    private  int Age;
    private  String kind;
    public void SetName( String nm )
    {
        Name = nm;
    }
    public  void SetAge(int age){
        Age = age;
    }
    public Dog_kind(String Kind){
        kind = Kind;
    }
    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" + "年齢は" + Age + "です。" );
    }
}
public class sample7_4 {
    public static void main(String[] args) {
        Dog_kind dog3 = new Dog_kind("柴犬");
        dog3.SetName("柴ちゃん");
        dog3.SetAge(2);
        dog3.ShowProfile();
    }
}
