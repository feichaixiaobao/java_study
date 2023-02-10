package jp.feichaixiaobao.user.uuwen.Sample5;
import java.util.Arrays;
import java.util.Scanner;

/*
練習問題 5 - 1
次のプログラムを作成しなさい。
・10 個の数値を入力する。
・入力された各々の数値を 2 倍にして表示する。
 */
public class Sample5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数値を 10 回入力する。");
        int num[] = new int[10];

        for(int i = 0 ; i < 10 ; i ++){
            System.out.print("数値を入力してください： ");
            num[i] = sc.nextInt();
        }
        System.out.println("配列num[]= " + Arrays.toString(num));

        System.out.println("数値を 2 倍にして表示する：");
        for(int i : num ){
            System.out.print( i * 2 + " " );
        }
    }
}