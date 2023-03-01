package jp.feichaixiaobao.user.uuwen.Sample7;
/*前問の Dog クラスに、次の内容を追加しなさい。
・犬種を保持するメンバー変数。（ String 型）
・犬種を設定する引数（ String ）を持つコンストラクタ。
・ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
 */
public class Sample7_4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.SetName("ギギ");
        dog.SetAge(4);
        dog.SetKind("マルチーズ");
        dog.ShowProfile();
    }
}
