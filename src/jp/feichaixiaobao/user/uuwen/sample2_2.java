package jp.feichaixiaobao.user.uuwen;
import java.util.Scanner;

/*
練習問題 2 - 2
int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
 */
public class sample2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// System.in -> キーボード入力を受け付けるための引数
        System.out.print("数値を入力してください：");
        
        int number = scanner.nextInt();// キーボード入力を受け付ける
        System.out.println("受け付ける数値: " + number);
    }
}
