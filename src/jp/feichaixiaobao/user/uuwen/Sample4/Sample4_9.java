package jp.feichaixiaobao.user.uuwen.Sample4;

import java.util.Scanner;

/*
練習問題 4 - 9
整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
 */
public class Sample4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数を 10 回入力");
        
        int intMax = 0;
        int intMin = 0;
        for(int i = 1 ; i <= 10 ; i ++){
            System.out.print("第" + i + "回,整数を入力: ");
            int value = scanner.nextInt();
            if(value > intMax){
                intMax = value;
            }
            else if(value < intMin){
                intMin = value;
            }
        }
        System.out.println("最大値: " +  intMax );
        System.out.println("最小値: " +  intMin );
    }
}
