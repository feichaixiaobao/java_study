package jp.feichaixiaobao.user.uuwen.Sample6;

/* サイズを示す数値（int）を引数とし、何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成しなさい。*/

public class Sample6_4 {
    public static void main(String[] args) {
        triangle(3);
        triangle(4);
        triangle(5);
    }
    static void triangle(int size) {
        for( int i = 0 ; i < size ; i++ ){
            for( int j = 0 ; j <= i ; j++ ){
                System.out.print( "$" );
            }
            System.out.println();
        }
    }
}