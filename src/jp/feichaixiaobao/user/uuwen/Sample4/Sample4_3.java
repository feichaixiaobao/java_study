package jp.feichaixiaobao.user.uuwen.Sample4;
/*
練習問題 4 - 3
2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
 */
public class Sample4_3 {
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1 ; i <= 8 ; i++ ){
            n *= 2;
            System.out.println("2の" + i + "乗から" + n + "です");
        }
    }
}
