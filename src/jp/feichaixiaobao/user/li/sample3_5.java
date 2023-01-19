package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 3 - 5
//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
//※奇数、偶数の判定には除算の余りを利用する。
public class sample3_5 {
    public static void main(String[] args) {
        System.out.println("正の整数値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 ==0){
            System.out.println("入力した整数は偶数。");
        }else {
            System.out.println("入力した整数は奇数。");
        }
    }
}
