package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 10
//        個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
public class sample4_9 {
    public static void main(String[] args) {
        System.out.println("個数を示す数値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = count;i > 0 ; i--){
            System.out.print("*");
        }
    }
}
