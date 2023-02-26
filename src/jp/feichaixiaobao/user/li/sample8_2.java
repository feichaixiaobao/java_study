package jp.feichaixiaobao.user.li;
//練習問題 8 - 2
//        前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
//        ・Dog はメンバー・メソッドRunを持つ。
//        　Run を実行すると“トコトコ”という文字列を表示する。
//
//        次のプログラムを作成しなさい。
//        ・Cat クラスと Dog クラスのインスタンスを作成する。
//        ・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
//        ・それぞれの ShowProfile を実行する。
//        ・Cat のインスタンスの Sleep を実行する。
//        ・Dog のインスタンスの Run を実行する。
class Dog_2 extends Animal{
    public void run(){
        System.out.println("トコトコ");
    }

    @Override
    public void Speak() {
        System.out.println("ワンワン");
    }
}
public class sample8_2 {
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

    }
}
