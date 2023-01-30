package jp.feichaixiaobao.user.uuwen.Sample4;

import java.util.Scanner;

/*
練習問題 4 - 8
自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
 */
public class Sample4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自然数（正の整数）を 10 回入力 ");
        
        int intMax = 0;
        for(int i = 1 ; i <= 10 ; i ++){
            System.out.print("第" + i + "回,整数を入力: ");
            int value = scanner.nextInt();
            if(value < 0){
                System.out.println( "入力が間違っています。正の整数を入力してください。" );
                return;
            }
            if(value > intMax){
                intMax = value;
            }
        }
        System.out.println("最大値: " +  intMax );
    }

}

