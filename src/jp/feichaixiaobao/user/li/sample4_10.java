package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 9
//        整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
public class sample4_10 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i <= 10;i++){
            System.out.println(i + "個整数を入力してください：");
            int value = sc.nextInt();
            if(value > max){
                max = value;
            }
            if(value < min){
                min = value;
            }
        }
        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
    }
}
