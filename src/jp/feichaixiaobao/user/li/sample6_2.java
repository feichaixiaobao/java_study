package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
//        また、メソッドの動作を検証できるようにプログラムを作成しなさい。
//        ※平均の計算は整数で行い、小数点以下は切り捨ててよい。
public class sample6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("一つの整数を入力してください：");
        int a = sc.nextInt();
        System.out.println("もう一つの整数を入力してください：");
        int b = sc.nextInt();
        System.out.println(av_sum(a,b));
    }
    public static int av_sum(int a ,int b){
        return  (a + b)/2;
    }
}
