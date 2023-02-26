package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 6 - 1
//        整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
//        また、メソッドの動作を検証できるようにプログラムを作成しなさい。
public class sample6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("整数を入力してください：");
        System.out.println(kake_2(sc.nextInt()));
    }
    public  static int kake_2(int x){
        return  x * x;
    }
}
