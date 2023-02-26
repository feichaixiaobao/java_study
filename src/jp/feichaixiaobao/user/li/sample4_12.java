package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 12
//        数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
public class sample4_12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum = 0;
        while (sum < 100){
            System.out.println("数値を入力してください：");
            int value = sc.nextInt();
            sum += value;
        }
        System.out.println("合計が 100 を超えた,合計額：" + sum);
    }
}
