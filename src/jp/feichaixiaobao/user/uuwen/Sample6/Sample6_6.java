package jp.feichaixiaobao.user.uuwen.Sample6;

/*九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
このメソッドを使用して、九九表を作成しなさい。
 */
public class Sample6_6 {
    public static void main(String[] args) {
        kuku(3);
    }

    static void kuku(int x ) {
        for( int i = 1 ; i <= 9 ; i++ ){
            System.out.println(x + " * " + i + " = " + x * i );
        }

        System.out.println();
    }
}
