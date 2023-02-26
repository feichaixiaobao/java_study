package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 8
//        自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
public class sample4_8 {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 10;i++){
            System.out.println("第" + (i + 1) + "個整数を入力してください：");
            int value = sc.nextInt();
            if(value > max){
                max = value;
            }
        }
        System.out.println("最大値：" + max);
    }
}
