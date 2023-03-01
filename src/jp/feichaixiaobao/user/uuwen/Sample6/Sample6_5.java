package jp.feichaixiaobao.user.uuwen.Sample6;

/*サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
※サイズを示す引数は int 型、表示する文字の引数は char 型にする。
 */
public class Sample6_5 {    
    public static void main(String[] args){
        triangle(5,"#");
        triangle(3,"&");

    }
    static void triangle(int size , String str) {
        for( int i = 0 ; i < size ; i++ ){
            for( int j = 0 ; j <= i ; j++ ){
                System.out.print( str );
            }
        System.out.println();
        }
    }
}
