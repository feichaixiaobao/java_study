package jp.feichaixiaobao.user.uuwen.Sample8;

/*前問で作成したクラスを使用して、次のプログラムを作成しなさい。
・Animal クラスの配列を作成する。要素数は 4。
・配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
・配列の総ての要素の Speak メソッドを実行する。 */

public class Sample8_4 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[4];

        animal[0] = new Cat();
        animal[1] = new Dog();
        animal[2] = new Cat();
        animal[3] = new Dog();

        for( Animal myPet : animal ){
            myPet.Speak();
        }
    }
}
