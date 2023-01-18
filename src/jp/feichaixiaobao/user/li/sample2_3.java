package jp.feichaixiaobao.user.li;

//練習問題 2 - 3
//int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。

import java.util.Scanner;

public class sample2_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ｘの値を入力してください。");
        int x = sc.nextInt();
        System.out.println("xを一乗は" + x);
        System.out.println("xを二乗は" + x * x);
        System.out.println("xを三乗は" + x * x * x);
    }
}
