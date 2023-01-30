package jp.feichaixiaobao.user.uuwen.Sample3;

import java.util.Scanner;

/*
整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
 */
public class Sample3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力:");
        int x = scanner.nextInt();
        int remainder = x % 2;

        if(remainder == 0 && x > 0) {
            System.out.println("正の偶数です。");
        } else if(remainder == 0 && x < 0){
            System.out.println("負の偶数です。");
        } else if(remainder != 0 && x > 0){
            System.out.println("正の奇数です。");
        } else {
            System.out.println("負の奇数です。");
        }
    }
}
