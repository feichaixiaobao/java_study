package jp.feichaixiaobao.user.li;
//練習問題 8 - 3
//        前問の Animal クラスに以下のメンバー・メソッドを追加しなさい。
//        ------------------------------------
//public void Speak()
//        {
//        System.out.println( "......" );
//        }
//        ------------------------------------
//        Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
//
//        次のプログラムを作成しなさい。
//        ・Cat クラスと Dog クラスのインスタンスを作成する。
//        ・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
//        ・それぞれの ShowProfile を実行する。
//        ・それぞれの Speak を実行する
public class sample8_3 {
    public static void main(String[] args) {
        Cat my_Cat = new Cat();
        Dog_2 my_Dog = new Dog_2();
        my_Dog.Name ="wangwang";
        my_Cat.Name ="miaomiao";
        my_Dog.Age = 2;
        my_Cat.Age = 1;
        my_Cat.ShowProfile();
        my_Dog.ShowProfile();
        my_Cat.Sleep();
        my_Dog.run();
        my_Dog.Speak();
        my_Cat.Speak();
    }
}
