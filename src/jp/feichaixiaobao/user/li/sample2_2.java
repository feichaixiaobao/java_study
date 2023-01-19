package jp.feichaixiaobao.user.li;
//練習問題 2 - 2
//int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
import java.util.Scanner;
public class sample2_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("xの値を入力してください：");
        int s= sc.nextInt();
        System.out.println("xの値："+ s );
    }
}
