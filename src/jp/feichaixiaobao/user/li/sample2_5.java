package jp.feichaixiaobao.user.li;
//練習問題 2 - 5
//２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
//※計算は整数で行い、小数点以下は切り捨ててよい。
import java.util.Scanner;
public class sample2_5 {
    public static void main(String[] args) {
        System.out.println("２つの整数値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("平均値:" + (x + y) / 2);
    }
}
