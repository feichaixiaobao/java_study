package jp.feichaixiaobao.user.uuwen;

import java.util.Scanner;

/*
練習問題 3 - 4
int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。
 */
public class sample3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("xを入力:");
        int x = scanner.nextInt();

        System.out.print("yを入力:");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println("xはyより大きい。");
        } else if (x < y) {
            System.out.println("xはyより小さい。");
        } else {
            System.out.println("xとyは等しい。");
        }
    }
}
