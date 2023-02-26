package jp.feichaixiaobao.user.li;
//練習問題 7 - 1
//        以下の Dog クラスを使用して、次のプログラムを作成しなさい。
//        ・Dog クラスのインスタンスを作成する。
//        ・SetName メソッドで名前を設定する。
//        ・ShowProfile メソッドで名前を表示する
//        ------------------------------------
class Dog
{
    private String Name;
    private  int Age;
    private  String kind;
    public void SetName( String nm )
    {
        Name = nm;
    }
    public  void SetAge(int age){
        Age = age;
    }
    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" + "年齢は" + Age + "です。" );
    }
}
public class sample7_1 {
    public static void main(String[] args) {
        Dog adog = new Dog();
        adog.SetName("wangwang");
        adog.ShowProfile();
    }

}
