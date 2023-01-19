package jp.feichaixiaobao.user.li;
//練習問題 2 - 1
//String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
import java.util.Scanner;
public class sample2_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("sの値を入力してください：");
        String s= sc.nextLine();
        System.out.println("sの値："+ s );
    }
}
