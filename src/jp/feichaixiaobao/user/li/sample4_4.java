package jp.feichaixiaobao.user.li;
//練習問題 4 - 4
//        7 の階乗を計算し、表示するプログラムを作成しなさい。
public class sample4_4 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1;i < 8;i++){
            sum *= i;
        }
        System.out.println("7 の階乗 = " + sum);
    }
}
