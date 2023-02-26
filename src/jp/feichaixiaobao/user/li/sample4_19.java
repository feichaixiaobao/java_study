package jp.feichaixiaobao.user.li;
import java.util.Scanner;
//練習問題 4 - 19
//        数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//        ※最後に入力された 0 は平均に含めない。
//        ※少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
public class sample4_19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("数値を入力してください：");
        int count = 0;
        int sum = 0;
        for(;;){
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            count++;
            sum+= num;
        }
        System.out.println("平均値：" + sum/count);
    }
}
