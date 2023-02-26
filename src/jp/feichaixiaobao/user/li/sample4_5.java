package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
public class sample4_5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 10;i++){
            System.out.println("第" + (i+1) + "の整数を入力してください：");
            int a = sc.nextInt();
            sum +=a;
        }
        System.out.println("平均値:" + sum/10);
    }
}
