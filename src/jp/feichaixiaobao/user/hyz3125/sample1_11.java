package jp.feichaixiaobao.user.hyz3125;

public class sample1_11 {
    public static void main(String[] args) {
        
    //int 型の変数 x に任意の数値を代入し、
    //x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
    int x;
    int y;
    while(true){
    x = (int)(Math.random() * 10);
    y = (int)(Math.random() * 10);
        if(x > y)break; 
        }
        System.out.println("x=" + x / y);
        System.out.println("x=" + x % y);
        
    }

}

