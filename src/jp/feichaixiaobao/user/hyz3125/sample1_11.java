package jp.feichaixiaobao.user.hyz3125;

public class sample1_11 {
    public static void main(String[] args) {
        
    //int 型の変数 x に任意の数値を代入し、
    //x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
   
    // コメントをつける場合、「//」とコメントの間にスペースを入れたほうがいい。例：// コメント内容 by.小宝
    
    int x = (int)(Math.random() * 10);
    int y = (int)(Math.random() * 10 - 1);
    
    // Math.random()で乱数を取得しているので、yはxより大きい場合がある。 by.小宝
        
    System.out.println("x=" + x / y);
    System.out.println("x=" + x % y);
    }
}
