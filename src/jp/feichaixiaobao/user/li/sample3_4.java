package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 3 - 4
//int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、
//x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。
public class sample3_4 {
    public static void main(String[] args) {
        System.out.println("xの値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("yの値を入力してください：");
        int y = sc.nextInt();
        if(x > y){
            System.out.println("xはyより大きい");
        } else if (x < y) {
            System.out.println("xはyより小さい");
        }else {
            System.out.println("xとyは等しい");
        }
    }
}
