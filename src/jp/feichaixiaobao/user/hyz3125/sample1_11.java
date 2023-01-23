package jp.feichaixiaobao.user.hyz3125;

public class sample1_11 {
    public static void main(String[] args) {
        
    //int 型の変数 x に任意の数値を代入し、
    //x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
<<<<<<< HEAD
    int x;
    int y;
    while(true){
    x = (int)(Math.random() * 10);
    y = (int)(Math.random() * 10);
        if(x > y)break; 
        }
        System.out.println("x=" + x / y);
        System.out.println("x=" + x % y);
        
=======
   
    // コメントをつける場合、「//」とコメントの間にスペースを入れたほうがいい。例：// コメント内容 by.小宝
    
    int x = (int)(Math.random() * 10);
    int y = (int)(Math.random() * 10 - 1);
    
    // Math.random()で乱数を取得しているので、yはxより大きい場合がある。 by.小宝
        
    System.out.println("x=" + x / y);
    System.out.println("x=" + x % y);
>>>>>>> cc1ab005c3ca954aac3169d26db48d0c0b58e7eb
    }

}

