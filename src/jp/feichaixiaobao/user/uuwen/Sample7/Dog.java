package jp.feichaixiaobao.user.uuwen.Sample7;

/*
 * Sample7_1 ~ 7_4 用のクラス
 */

public class Dog {
    private String Name;
    private int Age;//Sample7_2
    private String Kind; //Sample7_4

    public void SetName( String nm ){
        Name = nm;
    }

    public void ShowProfile(){
        System.out.println( Kind + "で名前は、" + Name + "、" + Age + "歳です。" );
    }

    //Sample7_2
    public void SetAge(int age){
        Age = age;
    }

    //Sample7_4
    public void SetKind(String kind){
        Kind = kind;
    }

}
