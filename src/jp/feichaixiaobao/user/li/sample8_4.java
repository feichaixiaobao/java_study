package jp.feichaixiaobao.user.li;
//練習問題 8 - 4
//        前問で作成したクラスを使用して、次のプログラムを作成しなさい。
//        ・Animal クラスの配列を作成する。要素数は 4。
//        ・配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
//        ・配列の総ての要素の Speak メソッドを実行する。
public class sample8_4 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog_2();
        animals[2] =new Cat();
        animals[3] =new Dog_2();
        for (Animal my_animal : animals){
            my_animal.Speak();
        }
    }
}
