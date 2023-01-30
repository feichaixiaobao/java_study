package jp.feichaixiaobao.user.uuwen.Sample3;

import java.util.Scanner;

/*
練習問題 3 - 5
正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
※奇数、偶数の判定には除算の余りを利用する。
 */
public class Sample3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力:");
        int x = scanner.nextInt();
        int remainder = x % 2;

        if(remainder == 0) {
            System.out.println("偶数です。");
        } else {
            System.out.println("奇数です。");
        }
    }
}
