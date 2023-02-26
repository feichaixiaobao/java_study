package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//数値を繰り返して入力し、合計が 100 を超えた場合、または入力が 10 回行われた場合、入力を止め入力された数値をすべて表示するプログラムを作成しなさい。
public class sample5_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int a[] =new int[10];
        while(sum <= 100 && count < 10){
            System.out.println("数値を入力してください：");
            a[count] = sc.nextInt();
            sum +=a[count];
            count++;
        }
        for (int i= 0;i < count;i++){
            System.out.print(a[i] + "、");
        }

    }
}
