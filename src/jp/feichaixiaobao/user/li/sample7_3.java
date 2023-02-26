package jp.feichaixiaobao.user.li;
//練習問題 7 - 3
//        前問の Dog クラスを使用して次のプログラムを作成しなさい。
//        ・Dog クラスのインスタンスを２つ作成する。
//        ・１つ目のインスタンスに、名前、年齢を設定する。
//        ・２つ目のインスタンスに、名前、年齢を設定する。
//        ・１つ目のインスタンスの、プロフィールを表示する。
//        ・２つ目のインスタンスの、プロフィールを表示する。
public class sample7_3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.SetName("tom");
        dog1.SetAge(2);
        dog2.SetName("rose");
        dog2.SetAge(1);
        dog1.ShowProfile();
        dog2.ShowProfile();
    }
}
