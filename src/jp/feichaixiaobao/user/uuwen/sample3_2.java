package jp.feichaixiaobao.user.uuwen;

import java.util.Scanner;

/*
練習問題 3 - 2
２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
 */
public class sample3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("xを入力:");
        int x = scanner.nextInt();

        System.out.print("yを入力:");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println(x);
        } 
        else if (y > x) {
			System.out.println(y);
		}
    }
}
