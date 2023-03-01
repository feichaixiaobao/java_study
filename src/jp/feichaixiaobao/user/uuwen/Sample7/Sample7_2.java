package jp.feichaixiaobao.user.uuwen.Sample7;
/*前問の Dog クラスに、次の内容を追加しなさい。
・年齢を保持する int 型のメンバー変数。
・年齢を設定するメンバー・メソッド、SetAge。
・ShowProfile メソッドで名前、年齢を表示するようにする。 */
public class Sample7_2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.SetName("ギギ");
        dog.SetAge(4);
        dog.ShowProfile();
    }
}
