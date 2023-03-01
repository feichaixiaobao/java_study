package jp.feichaixiaobao.user.uuwen.Sample6;
/*メソッドを再帰的に呼び出すことによって、フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
最初の２つの項、0 番目を 0、1 番目を 1 とします。
このメソッドを使用して、11 番目から 20 番目までの項を表示するプログラムを作成しなさい。 */
public class Sample6_8 {
    public static void main(String[] args) {
        for(int i = 11; i <= 20 ; i ++){
            System.out.println( fibonacci( i ) + " " );
        }
    }

    static int fibonacci(int x ) {
        if(x == 0){
            return 0 ;
        }else if ( x == 1){
            return 1;
        }else {
            return (fibonacci( x - 2) + fibonacci( x - 1 ));
        }
    }
}
