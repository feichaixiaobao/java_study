package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
練習問題 4 - 15
入力された数が素数かどうかを判定するプログラムを作成しなさい。
※ 	判定する数は 4 以上としてよい。
*/

/*
素数:
1より大きい整数で、1と自分自身でしか割り切れない数のことです。
1〜100まで、「2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97」の25個です。
 */
public class Sample4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値を入力：");
        int value = sc.nextInt();

        if (value < 2) {
            System.out.println(value + "は素数ではありません。");
            return;
        }

        for(int i = 2 ; i < value ; i++){
            if(value % i == 0){
                System.out.println(value + "は素数ではありません。");
                return;
            }
        }
        System.out.println(value + "は素数です。");

    }
}
