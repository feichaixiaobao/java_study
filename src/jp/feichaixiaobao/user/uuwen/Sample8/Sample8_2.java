package jp.feichaixiaobao.user.uuwen.Sample8;

/*前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
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
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        cat.Name = "KIKI";
        cat.Age = 3;
        cat.ShowProfile();
        cat.Sleep();

        dog.Name = "Bmo";
        dog.Age = 3;
        dog.ShowProfile();
        dog.Run();
    }
}
