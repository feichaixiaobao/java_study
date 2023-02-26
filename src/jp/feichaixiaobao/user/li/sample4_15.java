package jp.feichaixiaobao.user.li;
//練習問題 4 - 15
//        入力された数が素数かどうかを判定するプログラムを作成しなさい。
//        ※判定する数は 4 以上としてよい。

import java.util.Scanner;

public class sample4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数を入力してください：");
        int num = sc.nextInt();
        int a = 0;
        for(int i = 2; i < num;i++){
            if(num % i == 0){
                a = 1;
            }
        }
        if(a == 0){
            System.out.println("素数");
        }else {
            System.out.println("素数ではない");
        }
    }
}
