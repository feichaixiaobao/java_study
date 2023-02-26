package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 14
//        前の問題に次の修正を加えなさい。
//        ・１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
//        ・ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//        ・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
public class sample4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strike = 0;
        int ball = 0;
        while (strike < 3 && ball <4){
            System.out.print("ストライク=1 or ボール=2 or ファウル=3？");
            int judge = sc.nextInt();
            if (judge == 1)
                strike++;
            else if (judge == 2)
                ball++;
            else if (judge == 3 && strike < 2)
                strike++;
        }
        System.out.println(ball + "ボール," + strike + "ストライク");
    }
}
