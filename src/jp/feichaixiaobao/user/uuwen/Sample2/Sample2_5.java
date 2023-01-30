package jp.feichaixiaobao.user.uuwen.Sample2;
import java.util.Scanner;

/* 
練習問題 2 - 5
２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
※計算は整数で行い、小数点以下は切り捨ててよい。
*/
public class Sample2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("xを入力:");
        int x = scanner.nextInt();

        System.out.print("yを入力:");
        int y = scanner.nextInt();

        System.out.println("平均値 = " + ((x + y)/2));
    }
}
