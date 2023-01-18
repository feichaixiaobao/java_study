package jp.feichaixiaobao.user.li;

//練習問題 2 - 4
//int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。

import java.util.Scanner;

public class sample2_4 {
    public static void main(String[] args) {
        System.out.println("xの値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("yの値を入力してください：");
        Scanner sc2 = new Scanner(System.in);
        // 「Scanner sc2 = new Scanner(System.in);」この行は不要。 by.小宝
        int y = sc.nextInt();

        System.out.println("x と y の和:" + (x + y) );
        System.out.println("x と y の差:" + (x - y) );
        System.out.println("x と y の積:" + (x * y) );
        System.out.println("x と y の商:" + (x / y) );
        System.out.println("x と y の余り:" + (x % y) );



    }
}
