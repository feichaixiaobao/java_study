package jp.feichaixiaobao.user.uuwen.Sample6;

/*練習問題 6 - 1
整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
また、メソッドの動作を検証できるようにプログラムを作成しなさい。 */

public class Sample6_1 {
    public static void main(String[] args) {
        System.out.println(number(3));
    }

    public static int number(int x) {
        return x * x;
    }
}

