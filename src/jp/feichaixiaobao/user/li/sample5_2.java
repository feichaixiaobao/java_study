package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 5 - 2
//        次のプログラムを作成しなさい。
//        ・10 個の数値を入力する。
//        ・入力された順番と逆の順番で 10 個の数値を表示する。
public class sample5_2 {
    public static void main(String[] args) {
        int []a = new int[10];
        Scanner sc =new Scanner(System.in);
        for (int i = 0;i < 10;i++){
            System.out.print("数値を入力してください：");
            a[i] =sc.nextInt();
        }
        for (int i = 10;i > 0;i--){
            System.out.println(a[i-1]);
        }
    }
}
