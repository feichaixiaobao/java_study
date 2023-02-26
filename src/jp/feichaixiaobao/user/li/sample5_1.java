package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 5 - 1
//        次のプログラムを作成しなさい。
//        ・10 個の数値を入力する。
//        ・入力された各々の数値を 2 倍にして表示する。
public class sample5_1 {
    public static void main(String[] args) {
        int []a = new int[10];
        Scanner sc =new Scanner(System.in);
        for (int i = 0;i < 10;i++){
            System.out.print("数値を入力してください：");
            a[i] =sc.nextInt();
        }
        for (int i = 0;i < 10;i++){
            System.out.println(2 * a[i]);
        }
    }
}
