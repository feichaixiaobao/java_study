package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
練習問題 4 - 11
個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
 */
public class Sample4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力：");
        int value = scanner.nextInt();
        
        int x = 0;
        for(int i = 0 ; i < value ; i++){
            if(x > 9){
                x = 0;
            }
            System.out.print(x++);
        }
    }
}
