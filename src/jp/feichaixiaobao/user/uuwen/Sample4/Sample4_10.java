package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
練習問題 4 - 10
個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
 */
public class Sample4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力：");
        int value = scanner.nextInt();

        for(int i = 1 ; i <= value ; i ++){
            System.out.print("*");
        }
    }
}
