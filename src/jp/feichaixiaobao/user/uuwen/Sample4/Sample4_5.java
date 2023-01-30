package jp.feichaixiaobao.user.uuwen.Sample4;

import java.util.Scanner;

/*
練習問題 4 - 5
整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
※計算は整数で行い、小数点以下は切り捨ててよい。
 */
public class Sample4_5 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");

        int sum = 0;
        int n = scanner.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            sum += n;
        }
        System.out.println(sum/10);
        

    }
}
