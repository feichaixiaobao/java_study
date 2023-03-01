package jp.feichaixiaobao.user.uuwen.Sample8;

/*前問の Animal クラスに以下のメンバー・メソッドを追加しなさい。
------------------------------------
public void Speak(){
    System.out.println( "......" );
}
------------------------------------
Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。

次のプログラムを作成しなさい。
・Cat クラスと Dog クラスのインスタンスを作成する。
・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
・それぞれの ShowProfile を実行する。
・それぞれの Speak を実行する。 */

public class Sample8_3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        cat.Name = "KIKI";
        cat.Age = 3;
        cat.ShowProfile();
        cat.Speak();

        dog.Name = "Bmo";
        dog.Age = 3;
        dog.ShowProfile();
        dog.Speak();
    }
}
