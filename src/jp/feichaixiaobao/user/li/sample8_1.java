package jp.feichaixiaobao.user.li;
//練習問題 8 - 1
//        以下の Animal クラスを継承したクラス（派生クラス）、Cat を作成しなさい。
//        ・Cat はメンバー・メソッド Sleep を持つ。
//        　Sleep を実行すると“スースー”という文字列を表示する。
//
//        次のプログラムを作成しなさい。
//        ・Cat クラスのインスタンスを作成する。
//        ・public のメンバー変数、Name、Age に名前、年齢を設定する。
//        ・ShowProfile を実行する。
//        ・Sleep を実行する。
//        ------------------------------------
class Animal
{
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
    public void Speak()
        {
        System.out.println( "......" );
        }
}
class Cat extends Animal{
    public void Sleep(){
        System.out.println("スースー");
    }

    @Override
    public void Speak() {
        System.out.println("ニャー");
    }
}
public class sample8_1 {
    public static void main(String[] args) {
        Cat my_cat = new Cat();
        my_cat.Name = "miao";
        my_cat.Age = 3;
        my_cat.ShowProfile();
        my_cat.Sleep();
    }
}
