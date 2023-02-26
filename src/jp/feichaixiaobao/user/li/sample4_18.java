package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//
//練習問題 4 - 18
//        数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
public class sample4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (;;){
            System.out.println("数を入力してください：");
            int num = sc.nextInt();
            sum +=num;
            if(num == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
