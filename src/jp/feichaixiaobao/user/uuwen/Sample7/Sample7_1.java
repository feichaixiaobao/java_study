package jp.feichaixiaobao.user.uuwen.Sample7;
/*以下の Dog クラスを使用して、次のプログラムを作成しなさい。
・Dog クラスのインスタンスを作成する。
・SetName メソッドで名前を設定する。
・ShowProfile メソッドで名前を表示する
------------------------------------
class Dog
{
    private String Name;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
    }
}
------------------------------------ */
public class Sample7_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.SetName("ギギ");
        dog.ShowProfile();
    }
}

