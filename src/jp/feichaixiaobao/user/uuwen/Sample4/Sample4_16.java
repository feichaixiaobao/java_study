package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
練習問題 4 - 16
2 以上の数値を入力し、素因数分解した結果を表示しなさい。
例：
------------------------------------
20100
2 2 3 5 5 67
------------------------------------
 */
public class Sample4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("素因数分解");
        System.out.print("数値を入力：");
        int value = sc.nextInt();

        if (value < 2) {
            System.out.print( "2以上の整数を入力してください" );
            return;
        }
        while(value > 1){
            for(int i = 2 ; i <= value ; i++){
                if(value % i == 0 ){
                    System.out.print( i + " ");
                    value /= i ;
                    break;
                }
            }
        }
    }
}
