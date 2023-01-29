package jp.feichaixiaobao.user.uuwen;
import java.util.Scanner;

/*
練習問題 2 - 3
int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */

public class sample2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// System.in -> キーボード入力を受け付けるための引数
        System.out.print("数値を入力してください：");

        int x = scanner.nextInt();// キーボード入力を受け付ける
        System.out.println("入力した数値を1乗、x = : " + x);
        System.out.println("入力した数値を2乗、x = : " + x * x );
        System.out.println("入力した数値を3乗、x = : " + x * x * x);
        
    }
    
}
