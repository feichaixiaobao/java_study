package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
練習問題 4 - 19
数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
※最後に入力された 0 は平均に含めない。
※少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
 */

public class Sample4_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 1 ;
        while(true){
            System.out.print(i + "回目,数値を入力：");
            int value = sc.nextInt();
            i++;
            if(value == 0){
                break;
            }
            sum += value;
        }
        System.out.println("合計 = " + sum);
        System.out.println("平均値 = " + sum/(i - 1));
    }
}
