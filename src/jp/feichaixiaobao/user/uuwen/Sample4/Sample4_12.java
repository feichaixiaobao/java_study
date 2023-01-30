package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
 */
public class Sample4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        while(sum <= 100){
            System.out.print("数値を入力：");
            int value = scanner.nextInt();
            sum += value;
        }
        System.out.println("合計 = " + sum);
    }
}
