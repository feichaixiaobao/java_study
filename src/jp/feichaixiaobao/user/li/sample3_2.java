package jp.feichaixiaobao.user.li;
import java.util.Scanner;
//練習問題 3 - 2
//２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
public class sample3_2 {
    public static void main(String[] args) {
        System.out.println("1つの整数値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("もう一つの整数値を入力してください：");
        int y = sc.nextInt();
        System.out.println("大きい方:"+ (x > y ? x : y));
    }
}
