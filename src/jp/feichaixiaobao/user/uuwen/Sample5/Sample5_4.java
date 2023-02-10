package jp.feichaixiaobao.user.uuwen.Sample5;

import java.util.Arrays;
import java.util.Scanner;

/*練習問題 5 - 4
数値を繰り返して入力し、合計が 100 を超えた場合、または入力が 10 回行われた場合、入力を止め入力された数値をすべて表示するプログラムを作成しなさい。
 */
public class Sample5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num[] = new int[10];
        while(count < 10 && sum <= 100){
            System.out.print("数値を入力してください： ");
            num[count] = sc.nextInt();
            sum += num[count++];
            
        }
        System.out.println("配列 = " + Arrays.toString(num));

        // for(int i = 0 ; i < count ; i++){
        //     System.out.print( num[i] + " " );
        // }
        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);

    }
}
