package jp.feichaixiaobao.user.uuwen.Sample5;

import java.util.Arrays;
import java.util.Scanner;

/* 
練習問題 5 - 3
次のプログラムを作成しなさい。
・10 個の数値を入力する。
・入力された数値を偶数と奇数に分類して表示する。
表示例：
------------------------------------
偶数：42 54 32 8
奇数：7 35 71 13 21 45
------------------------------------
*/
public class Sample5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数値を 10 回入力する。");
        int num[] = new int[10];

        for(int i = 0 ; i < 10 ; i ++){
            System.out.print("数値を入力してください： ");
            num[i] = sc.nextInt();
        }
        System.out.println("配列num[]= " + Arrays.toString(num));
        
        System.out.print("偶数: ");
        for(int x : num ){
            if(x % 2 == 0){
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.print("奇数: ");
        for(int y : num ){
            if(y % 2 != 0){
                System.out.print(y + " ");
            }
        }
    }
}
