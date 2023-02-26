package jp.feichaixiaobao.user.li;
//練習問題 7 - 2
//        前問の Dog クラスに、次の内容を追加しなさい。
//        ・年齢を保持する int 型のメンバー変数。
//        ・年齢を設定するメンバー・メソッド、SetAge。
//        ・ShowProfile メソッドで名前、年齢を表示するようにする。
//修正した Dog クラスを使用して次のプログラムを作成しなさい。
//        ・Dog クラスのインスタンスを作成する。
//        ・名前、年齢を設定する。
//        ・プロフィールを表示する。
public class sample7_2 {
    public static void main(String[] args) {
        Dog dog_tom = new Dog();
        dog_tom.SetName("wangwang");
        dog_tom.SetAge(2);
        dog_tom.ShowProfile();
    }
}