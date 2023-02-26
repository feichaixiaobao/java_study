package jp.feichaixiaobao.user.li;
import java.util.Scanner;

//練習問題 4 - 13
//        ストライク・カウントを数えるプログラムを作成しなさい。
//        ・１球ごとにストライクかボールかを入力する。
//        ・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//        ※ストライクの場合は1、ボールの場合は2を入力する。
//        ------------------------------------
//        ストライク=1 or ボール=2 ？
//        1
//        ストライク=1 or ボール=2 ？
//        2
//        ストライク=1 or ボール=2 ？
//        1
//        ストライク=1 or ボール=2 ？
//        1
//        1ボール,3ストライク
//        ------------------------------------
public class sample4_13 {
    public static void main(String[] args) {
        int s_count = 0;
        int b_count = 0;
        Scanner sc = new Scanner(System.in);
        while (s_count < 3 && b_count < 4){
            System.out.println("ストライク=1 or ボール=2 ？");
            int value = sc.nextInt();
            if(value == 1){
                s_count++;
            }else {
                b_count++;
            }
        }
        System.out.println(b_count + "ボール," + s_count + "ストライク");
    }
}
