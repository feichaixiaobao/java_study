package jp.feichaixiaobao.user.uuwen.Sample6;

/*２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
また、メソッドの動作を検証できるようにプログラムを作成しなさい。 */

public class Sample6_2 {
    public static void main(String[] args) {
        System.out.println(avg(6,27));
    }
    public static int avg(int x, int y) {
        return (x + y )/2;
    }
}
