package jp.feichaixiaobao.user.uuwen.Sample4;
import java.util.Scanner;

/*
練習問題 4 - 13
ストライク・カウントを数えるプログラムを作成しなさい。
・１球ごとにストライクかボールかを入力する。
・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
※ストライクの場合は1、ボールの場合は2を入力する。
------------------------------------
ストライク=1 or ボール=2 ？
1
ストライク=1 or ボール=2 ？
2
ストライク=1 or ボール=2 ？
1
ストライク=1 or ボール=2 ？
1
1ボール,3ストライク
------------------------------------
 */
public class Sample4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int strike = 0;
        int ball = 0;
        while(strike < 3 && ball < 4){
            System.out.print("ストライク=1 or ボール=2 ？ : ");
            int value = scanner.nextInt();
            if(value == 1){
                strike++;
            }
            else if(value == 2){
                ball++;
            }
            else{
                System.out.println( "入力が間違っています。" );
                return;
            }
        }
        System.out.println(strike + " strike") ;
        System.out.println(ball + " ball");
    }
}
