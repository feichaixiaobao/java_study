package jp.feichaixiaobao.user.uuwen.Sample3;

import java.util.Scanner;

/*
練習問題 3 - 1
int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
 */

public class Sample3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("xを入力:");
        int x = scanner.nextInt();

        System.out.print("yを入力:");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println("xはyより大きい。");
        } 
    }
}
