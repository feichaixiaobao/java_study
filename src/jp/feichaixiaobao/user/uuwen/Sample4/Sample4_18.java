package jp.feichaixiaobao.user.uuwen.Sample4;

import java.util.Scanner;

/*
練習問題 4 - 18
数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
 */
public class Sample4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("数値を入力：");
            int value = sc.nextInt();
            if(value == 0){
                break;
            }
            sum += value;
        }
        System.out.println("合計 = " + sum);
    }
}
